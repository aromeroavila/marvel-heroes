
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("name")
    @Expose
    private String name;

    public Item withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

}
