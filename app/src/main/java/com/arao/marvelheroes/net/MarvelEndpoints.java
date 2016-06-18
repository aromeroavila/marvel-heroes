package com.arao.marvelheroes.net;

import com.arao.marvelheroes.master.model.CharacterDataWrapper;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

interface MarvelEndpoints {

    @GET("v1/public/characters")
    Call<CharacterDataWrapper> getCharacters(@QueryMap Map<String, String> authParams);

}
