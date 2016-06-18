package com.arao.marvelheroes.net;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

interface MarvelEndpoints {

    @GET("v1/public/characters/{characterId}/comics")
    Call<CharacterDataWrapper> getCharacters(@Path("characterId") String characterId, @QueryMap Map<String, String> authParams);

}
