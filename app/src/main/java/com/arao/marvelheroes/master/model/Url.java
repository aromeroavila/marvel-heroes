
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("url")
    @Expose
    private String url;

    public Url withType(String type) {
        this.type = type;
        return this;
    }

    public Url withUrl(String url) {
        this.url = url;
        return this;
    }

}
