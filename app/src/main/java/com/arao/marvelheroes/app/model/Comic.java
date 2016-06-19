
package com.arao.marvelheroes.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Comic implements Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("digitalId")
    @Expose
    private Integer digitalId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("issueNumber")
    @Expose
    private Double issueNumber;
    @SerializedName("variantDescription")
    @Expose
    private String variantDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("modified")
    @Expose
    private String modified;
    @SerializedName("isbn")
    @Expose
    private String isbn;
    @SerializedName("upc")
    @Expose
    private String upc;
    @SerializedName("diamondCode")
    @Expose
    private String diamondCode;
    @SerializedName("ean")
    @Expose
    private String ean;
    @SerializedName("issn")
    @Expose
    private String issn;
    @SerializedName("format")
    @Expose
    private String format;
    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("textObjects")
    @Expose
    private List<TextObject> textObjects = new ArrayList<TextObject>();
    @SerializedName("resourceURI")
    @Expose
    private String resourceURI;
    @SerializedName("urls")
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    @SerializedName("series")
    @Expose
    private Series series;
    @SerializedName("variants")
    @Expose
    private List<Object> variants = new ArrayList<Object>();
    @SerializedName("collections")
    @Expose
    private List<Object> collections = new ArrayList<Object>();
    @SerializedName("collectedIssues")
    @Expose
    private List<Object> collectedIssues = new ArrayList<Object>();
    @SerializedName("dates")
    @Expose
    private List<Date> dates = new ArrayList<Date>();
    @SerializedName("prices")
    @Expose
    private List<Price> prices = new ArrayList<Price>();
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("creators")
    @Expose
    private Creators creators;
    @SerializedName("characters")
    @Expose
    private Characters characters;
    @SerializedName("stories")
    @Expose
    private Stories stories;
    @SerializedName("events")
    @Expose
    private Events events;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The digitalId
     */
    public Integer getDigitalId() {
        return digitalId;
    }

    /**
     * @param digitalId The digitalId
     */
    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The issueNumber
     */
    public Double getIssueNumber() {
        return issueNumber;
    }

    /**
     * @param issueNumber The issueNumber
     */
    public void setIssueNumber(Double issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     * @return The variantDescription
     */
    public String getVariantDescription() {
        return variantDescription;
    }

    /**
     * @param variantDescription The variantDescription
     */
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * @return The isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn The isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return The upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * @param upc The upc
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * @return The diamondCode
     */
    public String getDiamondCode() {
        return diamondCode;
    }

    /**
     * @param diamondCode The diamondCode
     */
    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    /**
     * @return The ean
     */
    public String getEan() {
        return ean;
    }

    /**
     * @param ean The ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    /**
     * @return The issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     * @param issn The issn
     */
    public void setIssn(String issn) {
        this.issn = issn;
    }

    /**
     * @return The format
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return The pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount The pageCount
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * @return The textObjects
     */
    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    /**
     * @param textObjects The textObjects
     */
    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }

    /**
     * @return The resourceURI
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     * @param resourceURI The resourceURI
     */
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    /**
     * @return The urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     * @param urls The urls
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    /**
     * @return The series
     */
    public Series getSeries() {
        return series;
    }

    /**
     * @param series The series
     */
    public void setSeries(Series series) {
        this.series = series;
    }

    /**
     * @return The variants
     */
    public List<Object> getVariants() {
        return variants;
    }

    /**
     * @param variants The variants
     */
    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }

    /**
     * @return The collections
     */
    public List<Object> getCollections() {
        return collections;
    }

    /**
     * @param collections The collections
     */
    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    /**
     * @return The collectedIssues
     */
    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    /**
     * @param collectedIssues The collectedIssues
     */
    public void setCollectedIssues(List<Object> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    /**
     * @return The dates
     */
    public List<Date> getDates() {
        return dates;
    }

    /**
     * @param dates The dates
     */
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    /**
     * @return The prices
     */
    public List<Price> getPrices() {
        return prices;
    }

    /**
     * @param prices The prices
     */
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    /**
     * @return The thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail The thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    /**
     * @return The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * @param images The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     * @return The creators
     */
    public Creators getCreators() {
        return creators;
    }

    /**
     * @param creators The creators
     */
    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    /**
     * @return The characters
     */
    public Characters getCharacters() {
        return characters;
    }

    /**
     * @param characters The characters
     */
    public void setCharacters(Characters characters) {
        this.characters = characters;
    }

    /**
     * @return The stories
     */
    public Stories getStories() {
        return stories;
    }

    /**
     * @param stories The stories
     */
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    /**
     * @return The events
     */
    public Events getEvents() {
        return events;
    }

    /**
     * @param events The events
     */
    public void setEvents(Events events) {
        this.events = events;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeValue(this.digitalId);
        dest.writeString(this.title);
        dest.writeValue(this.issueNumber);
        dest.writeString(this.variantDescription);
        dest.writeString(this.description);
        dest.writeString(this.modified);
        dest.writeString(this.isbn);
        dest.writeString(this.upc);
        dest.writeString(this.diamondCode);
        dest.writeString(this.ean);
        dest.writeString(this.issn);
        dest.writeString(this.format);
        dest.writeValue(this.pageCount);
        dest.writeList(this.textObjects);
        dest.writeString(this.resourceURI);
        dest.writeList(this.urls);
        dest.writeParcelable(this.series, flags);
        dest.writeList(this.variants);
        dest.writeList(this.collections);
        dest.writeList(this.collectedIssues);
        dest.writeList(this.dates);
        dest.writeList(this.prices);
        dest.writeParcelable(this.thumbnail, flags);
        dest.writeList(this.images);
        dest.writeParcelable(this.creators, flags);
        dest.writeParcelable(this.characters, flags);
        dest.writeParcelable(this.stories, flags);
        dest.writeParcelable(this.events, flags);
    }

    public Comic() {
    }

    protected Comic(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.digitalId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.title = in.readString();
        this.issueNumber = (Double) in.readValue(Double.class.getClassLoader());
        this.variantDescription = in.readString();
        this.description = in.readString();
        this.modified = in.readString();
        this.isbn = in.readString();
        this.upc = in.readString();
        this.diamondCode = in.readString();
        this.ean = in.readString();
        this.issn = in.readString();
        this.format = in.readString();
        this.pageCount = (Integer) in.readValue(Integer.class.getClassLoader());
        this.textObjects = new ArrayList<TextObject>();
        in.readList(this.textObjects, TextObject.class.getClassLoader());
        this.resourceURI = in.readString();
        this.urls = new ArrayList<Url>();
        in.readList(this.urls, Url.class.getClassLoader());
        this.series = in.readParcelable(Series.class.getClassLoader());
        this.variants = new ArrayList<Object>();
        in.readList(this.variants, Object.class.getClassLoader());
        this.collections = new ArrayList<Object>();
        in.readList(this.collections, Object.class.getClassLoader());
        this.collectedIssues = new ArrayList<Object>();
        in.readList(this.collectedIssues, Object.class.getClassLoader());
        this.dates = new ArrayList<Date>();
        in.readList(this.dates, Date.class.getClassLoader());
        this.prices = new ArrayList<Price>();
        in.readList(this.prices, Price.class.getClassLoader());
        this.thumbnail = in.readParcelable(Thumbnail.class.getClassLoader());
        this.images = new ArrayList<Image>();
        in.readList(this.images, Image.class.getClassLoader());
        this.creators = in.readParcelable(Creators.class.getClassLoader());
        this.characters = in.readParcelable(Characters.class.getClassLoader());
        this.stories = in.readParcelable(Stories.class.getClassLoader());
        this.events = in.readParcelable(Events.class.getClassLoader());
    }

    public static final Parcelable.Creator<Comic> CREATOR = new Parcelable.Creator<Comic>() {
        @Override
        public Comic createFromParcel(Parcel source) {
            return new Comic(source);
        }

        @Override
        public Comic[] newArray(int size) {
            return new Comic[size];
        }
    };
}