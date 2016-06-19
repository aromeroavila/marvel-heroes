
package com.arao.marvelheroes.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Events implements Parcelable {

    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;
    @SerializedName("items")
    @Expose
    private List<Object> items = new ArrayList<Object>();
    @SerializedName("returned")
    @Expose
    private Integer returned;

    /**
     * @return The available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * @param available The available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     * @return The collectionURI
     */
    public String getCollectionURI() {
        return collectionURI;
    }

    /**
     * @param collectionURI The collectionURI
     */
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    /**
     * @return The items
     */
    public List<Object> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Object> items) {
        this.items = items;
    }

    /**
     * @return The returned
     */
    public Integer getReturned() {
        return returned;
    }

    /**
     * @param returned The returned
     */
    public void setReturned(Integer returned) {
        this.returned = returned;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.available);
        dest.writeString(this.collectionURI);
        dest.writeList(this.items);
        dest.writeValue(this.returned);
    }

    public Events() {
    }

    protected Events(Parcel in) {
        this.available = (Integer) in.readValue(Integer.class.getClassLoader());
        this.collectionURI = in.readString();
        this.items = new ArrayList<Object>();
        in.readList(this.items, Object.class.getClassLoader());
        this.returned = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Events> CREATOR = new Parcelable.Creator<Events>() {
        @Override
        public Events createFromParcel(Parcel source) {
            return new Events(source);
        }

        @Override
        public Events[] newArray(int size) {
            return new Events[size];
        }
    };
}
