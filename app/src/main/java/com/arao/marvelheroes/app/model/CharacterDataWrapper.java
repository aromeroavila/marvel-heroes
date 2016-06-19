
package com.arao.marvelheroes.app.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterDataWrapper implements Parcelable {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("attributionText")
    @Expose
    private String attributionText;
    @SerializedName("attributionHTML")
    @Expose
    private String attributionHTML;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("data")
    @Expose
    private ComicDataContainer comicDataContainer;

    /**
     * @return The code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * @param code The code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return The copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @param copyright The copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * @return The attributionText
     */
    public String getAttributionText() {
        return attributionText;
    }

    /**
     * @param attributionText The attributionText
     */
    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    /**
     * @return The attributionHTML
     */
    public String getAttributionHTML() {
        return attributionHTML;
    }

    /**
     * @param attributionHTML The attributionHTML
     */
    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }

    /**
     * @return The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     * @param etag The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     * @return The data
     */
    public ComicDataContainer getComicDataContainer() {
        return comicDataContainer;
    }

    /**
     * @param comicDataContainer The data
     */
    public void setComicDataContainer(ComicDataContainer comicDataContainer) {
        this.comicDataContainer = comicDataContainer;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.code);
        dest.writeString(this.status);
        dest.writeString(this.copyright);
        dest.writeString(this.attributionText);
        dest.writeString(this.attributionHTML);
        dest.writeString(this.etag);
        dest.writeParcelable(this.comicDataContainer, flags);
    }

    public CharacterDataWrapper() {
    }

    protected CharacterDataWrapper(Parcel in) {
        this.code = (Integer) in.readValue(Integer.class.getClassLoader());
        this.status = in.readString();
        this.copyright = in.readString();
        this.attributionText = in.readString();
        this.attributionHTML = in.readString();
        this.etag = in.readString();
        this.comicDataContainer = in.readParcelable(ComicDataContainer.class.getClassLoader());
    }

    public static final Parcelable.Creator<CharacterDataWrapper> CREATOR = new Parcelable.Creator<CharacterDataWrapper>() {
        @Override
        public CharacterDataWrapper createFromParcel(Parcel source) {
            return new CharacterDataWrapper(source);
        }

        @Override
        public CharacterDataWrapper[] newArray(int size) {
            return new CharacterDataWrapper[size];
        }
    };
}
