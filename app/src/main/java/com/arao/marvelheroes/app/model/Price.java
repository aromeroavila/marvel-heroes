
package com.arao.marvelheroes.app.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("price")
    @Expose
    private Float price;

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(Float price) {
        this.price = price;
    }

}
