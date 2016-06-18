
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Result {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("comics")
    @Expose
    private Comics comics;
    @SerializedName("series")
    @Expose
    private Series series;
    @SerializedName("stories")
    @Expose
    private Stories stories;
    @SerializedName("events")
    @Expose
    private Events events;
    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();

    public Comics getComics() {
        return comics;
    }

    public String getDescription() {
        return description;
    }

    public Events getEvents() {
        return events;
    }

    public Integer getId() {
        return id;
    }

    public String getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public Series getSeries() {
        return series;
    }

    public Stories getStories() {
        return stories;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public Result withId(Integer id) {
        this.id = id;
        return this;
    }

    public Result withName(String name) {
        this.name = name;
        return this;
    }

    public Result withDescription(String description) {
        this.description = description;
        return this;
    }

    public Result withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public Result withThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public Result withResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
        return this;
    }

    public Result withComics(Comics comics) {
        this.comics = comics;
        return this;
    }

    public Result withSeries(Series series) {
        this.series = series;
        return this;
    }

    public Result withStories(Stories stories) {
        this.stories = stories;
        return this;
    }

    public Result withEvents(Events events) {
        this.events = events;
        return this;
    }

    public Result withUrls(List<Url> urls) {
        this.urls = urls;
        return this;
    }

}
