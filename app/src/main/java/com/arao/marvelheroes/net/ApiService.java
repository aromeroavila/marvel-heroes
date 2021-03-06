package com.arao.marvelheroes.net;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;

import retrofit2.Callback;

public interface ApiService {

    void fetchComicsFromCharacter(String characterId, Callback<CharacterDataWrapper> callback);

}
