
package com.arao.marvelheroes.master.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CharacterDataWrapper {

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
    public Data data;

    public CharacterDataWrapper withCode(Integer code) {
        this.code = code;
        return this;
    }

    public CharacterDataWrapper withStatus(String status) {
        this.status = status;
        return this;
    }

    public CharacterDataWrapper withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public CharacterDataWrapper withAttributionText(String attributionText) {
        this.attributionText = attributionText;
        return this;
    }

    public CharacterDataWrapper withAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
        return this;
    }

    public CharacterDataWrapper withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    public CharacterDataWrapper withData(Data data) {
        this.data = data;
        return this;
    }

}
