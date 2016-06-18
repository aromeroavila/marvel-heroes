
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Data {

    @SerializedName("offset")
    @Expose
    private Integer offset;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("results")
    @Expose
    private List<Result> results = new ArrayList<Result>();

    public Data withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Data withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Data withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Data withCount(Integer count) {
        this.count = count;
        return this;
    }

    public Data withResults(List<Result> results) {
        this.results = results;
        return this;
    }

}
