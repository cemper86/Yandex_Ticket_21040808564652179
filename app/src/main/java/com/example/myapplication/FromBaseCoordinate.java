package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FromBaseCoordinate implements Parcelable {

  @SerializedName("Lat")
  @Expose
  public Double latitude;

  @SerializedName("Lng")
  @Expose
  public Double longitude;

  @SerializedName("StepIndex")
  @Expose
  public Integer stepIndex;

  private double distance;

  public FromBaseCoordinate(Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public FromBaseCoordinate(Double latitude, Double longitude, Integer stepIndex) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.stepIndex = stepIndex;
  }

  protected FromBaseCoordinate(Parcel in) {
    if (in.readByte() == 0) {
      latitude = null;
    } else {
      latitude = in.readDouble();
    }
    if (in.readByte() == 0) {
      longitude = null;
    } else {
      longitude = in.readDouble();
    }
    if (in.readByte() == 0) {
      stepIndex = null;
    } else {
      stepIndex = in.readInt();
    }
    distance = in.readDouble();
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    if (latitude == null) {
      dest.writeByte((byte) 0);
    } else {
      dest.writeByte((byte) 1);
      dest.writeDouble(latitude);
    }
    if (longitude == null) {
      dest.writeByte((byte) 0);
    } else {
      dest.writeByte((byte) 1);
      dest.writeDouble(longitude);
    }
    if (stepIndex == null) {
      dest.writeByte((byte) 0);
    } else {
      dest.writeByte((byte) 1);
      dest.writeInt(stepIndex);
    }
    dest.writeDouble(distance);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public static final Creator<FromBaseCoordinate> CREATOR = new Creator<FromBaseCoordinate>() {
    @Override
    public FromBaseCoordinate createFromParcel(Parcel in) {
      return new FromBaseCoordinate(in);
    }

    @Override
    public FromBaseCoordinate[] newArray(int size) {
      return new FromBaseCoordinate[size];
    }
  };

  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Integer getStepIndex() {
    return stepIndex;
  }

  public void setStepIndex(Integer stepIndex) {
    this.stepIndex = stepIndex;
  }

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getDistance() {
    return distance;
  }
}
