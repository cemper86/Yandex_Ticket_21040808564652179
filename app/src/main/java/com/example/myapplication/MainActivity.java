package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.Cluster;
import com.yandex.mapkit.map.ClusterListener;
import com.yandex.mapkit.map.ClusterTapListener;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.ImageProvider;

public class MainActivity extends AppCompatActivity implements ClusterListener, ClusterTapListener {

    private ActivityMainBinding binding;

    private BottomSheetBehavior menuBottomSheetBehavior;
    private BottomSheetBehavior markerBottomSheetBehavior;

    private ImageProvider imageProvider;
    private ClusterizedPlacemarkCollection clusterizedCollection;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MapKitFactory.setApiKey(getString(R.string.map_key));
        MapKitFactory.initialize(this);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        imageProvider = ImageProvider.fromResource(
                this, R.drawable.marker_build);

        initView();
        initViewModel();


    }

    private void initViewModel(){

    }

    private void initView(){
        initMapObjects();
    }


    @Override
    protected void onStart() {
        super.onStart();
        startMap();
    }

    private MapView getMap(){
        return  binding.mapView;
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopMap();
    }

    private void startMap(){
        getMap().onStart();
        MapKitFactory.getInstance().onStart();
    }

    private void stopMap(){
        getMap().onStop();
        MapKitFactory.getInstance().onStop();
    }

    private void initMapObjects(){
        clusterizedCollection =
                getMap().getMap().getMapObjects().addClusterizedPlacemarkCollection(this);
        ClusterizedMapCollectionOnMapCase clusterizedMapCollectionOnMapCase
                = new ClusterizedMapCollectionOnMapCase(this, clusterizedCollection, new ClusterizedMapCollectionOnMapCase.MarkerOnTapListener() {
            @Override
            public void onTapMarker(MarkerModel marker) {
                String msg = "Tap in marker id="+ marker.id;
                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_SHORT).show();
            }
        });
        clusterizedMapCollectionOnMapCase.setMarkers(TestDataClass.getMarkers());

        clusterizedCollection.clusterPlacemarks(60, 15);
    }

    @Override
    public void onClusterAdded(@NonNull Cluster cluster) {
        cluster.getAppearance().setIcon(
                new TextImageProvider(this, Integer.toString(cluster.getSize())));
        cluster.addClusterTapListener(this);
    }

    @Override
    public boolean onClusterTap(Cluster cluster) {
        // We return true to notify map that the tap was handled and shouldn't be
        // propagated further.
        Log.d("LOG_TEST", "on Tap claster");
        return true;
    }

}