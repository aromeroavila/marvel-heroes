package com.arao.marvelheroes.net;

import com.arao.marvelheroes.master.model.CharacterDataWrapper;

import retrofit2.Callback;

public interface ApiService {

    void fetchCharacters(Callback<CharacterDataWrapper> callback);

}
