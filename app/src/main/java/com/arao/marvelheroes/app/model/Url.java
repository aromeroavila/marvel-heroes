
package com.arao.marvelheroes.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url implements Parcelable {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.type);
        dest.writeString(this.url);
    }

    public Url() {
    }

    protected Url(Parcel in) {
        this.type = in.readString();
        this.url = in.readString();
    }

    public static final Parcelable.Creator<Url> CREATOR = new Parcelable.Creator<Url>() {
        @Override
        public Url createFromParcel(Parcel source) {
            return new Url(source);
        }

        @Override
        public Url[] newArray(int size) {
            return new Url[size];
        }
    };
}
