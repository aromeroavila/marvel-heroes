
package com.arao.marvelheroes.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Characters implements Parcelable {

    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
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
    public List<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(List<Item> items) {
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

    public Characters() {
    }

    protected Characters(Parcel in) {
        this.available = (Integer) in.readValue(Integer.class.getClassLoader());
        this.collectionURI = in.readString();
        this.items = new ArrayList<Item>();
        in.readList(this.items, Item.class.getClassLoader());
        this.returned = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<Characters> CREATOR = new Parcelable.Creator<Characters>() {
        @Override
        public Characters createFromParcel(Parcel source) {
            return new Characters(source);
        }

        @Override
        public Characters[] newArray(int size) {
            return new Characters[size];
        }
    };
}
