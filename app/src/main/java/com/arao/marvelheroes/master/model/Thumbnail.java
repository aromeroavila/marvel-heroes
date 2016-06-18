
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("extension")
    @Expose
    private String extension;

    public String getExtension() {
        return extension;
    }

    public String getPath() {
        return path;
    }

    public Thumbnail withPath(String path) {
        this.path = path;
        return this;
    }

    public Thumbnail withExtension(String extension) {
        this.extension = extension;
        return this;
    }

}
