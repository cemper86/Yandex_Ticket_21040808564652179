 package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

 public class MarkerModel implements Parcelable {

     @SerializedName("id")
     @Expose
     public int id;

     @SerializedName("title")
     @Expose
     public String title;

     @SerializedName("description")
     @Expose
     public String description;

     @SerializedName("images")
     @Expose
     public List<String> images;

     @SerializedName("coordinate")
     @Expose
     public FromBaseCoordinate coordinate;

     public MarkerModel(int id, String title, String description, List<String> images, FromBaseCoordinate coordinate) {
         this.id = id;
         this.title = title;
         this.description = description;
         this.images = images;
         this.coordinate = coordinate;
     }

     protected MarkerModel(Parcel in) {
         id = in.readInt();
         title = in.readString();
         description = in.readString();
         images = in.createStringArrayList();
         coordinate = in.readParcelable(FromBaseCoordinate.class.getClassLoader());
     }

     @Override
     public void writeToParcel(Parcel dest, int flags) {
         dest.writeInt(id);
         dest.writeString(title);
         dest.writeString(description);
         dest.writeStringList(images);
         dest.writeParcelable(coordinate, flags);
     }

     @Override
     public int describeContents() {
         return 0;
     }

     public static final Creator<MarkerModel> CREATOR = new Creator<MarkerModel>() {
         @Override
         public MarkerModel createFromParcel(Parcel in) {
             return new MarkerModel(in);
         }

         @Override
         public MarkerModel[] newArray(int size) {
             return new MarkerModel[size];
         }
     };

 }
