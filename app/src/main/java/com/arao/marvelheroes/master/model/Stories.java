
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Stories {

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

    public Stories withAvailable(Integer available) {
        this.available = available;
        return this;
    }

    public Stories withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public Stories withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Stories withReturned(Integer returned) {
        this.returned = returned;
        return this;
    }

}
