package com.example.myapplication;

import android.app.Activity;
import android.util.Log;

import androidx.annotation.NonNull;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.ClusterizedPlacemarkCollection;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.runtime.image.ImageProvider;

import java.util.List;

public class ClusterizedMapCollectionOnMapCase implements MapObjectTapListener {

    private Activity activity;
    private ClusterizedPlacemarkCollection collection;
    private MarkerOnTapListener listener;

    private List<MarkerModel> markers;
    private List<Point> points;

    public interface MarkerOnTapListener {
        void onTapMarker(MarkerModel marker);
    }

    public ClusterizedMapCollectionOnMapCase(Activity activity, ClusterizedPlacemarkCollection collection, MarkerOnTapListener listener) {
        this.activity = activity;
        this.collection = collection;
        this.listener = listener;
    }

    public void setMarkers(List<MarkerModel> markers){
        this.markers = markers;
        for (MarkerModel marker : markers) {
            setBuildMarker(marker);
        }
    }

    private void setBuildMarker(MarkerModel marker) {
        PlacemarkMapObject object = collection.addPlacemark(createMarkerPoint(marker), createMarkerIcon(R.drawable.marker_build));
        object.setUserData(marker);
        object.addTapListener(this);
        Log.d("LOG_TEST", "set on TapListener for marker id=" + marker.id);
    }

    private ImageProvider createMarkerIcon(int resourceId) {
        return ImageProvider.fromResource(activity, resourceId);
    }

    private Point createMarkerPoint(MarkerModel marker) {
        FromBaseCoordinate coordinates = marker.coordinate;
        return new Point(coordinates.latitude, coordinates.longitude);
    }

    @Override
    public boolean onMapObjectTap(@NonNull MapObject mapObject, @NonNull Point point) {
        MarkerModel marker = (MarkerModel) mapObject.getUserData();
        listener.onTapMarker(marker);
        if(marker != null) Log.d("LOG_TEST","on Tap on the Marker id = "+ marker.id );
        return false;
    }
}