
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Comics {

    @SerializedName("available")
    @Expose
    private Integer available;
    @SerializedName("collectionURI")
    @Expose
    private String collectionURI;
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<>();
    @SerializedName("returned")
    @Expose
    private Integer returned;

    public Comics withAvailable(Integer available) {
        this.available = available;
        return this;
    }

    public Comics withCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
        return this;
    }

    public Comics withItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public Comics withReturned(Integer returned) {
        this.returned = returned;
        return this;
    }

}
