package com.arao.marvelheroes.master;

import android.util.Log;

import com.arao.marvelheroes.master.model.CharacterDataWrapper;
import com.arao.marvelheroes.net.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class HeroesListPresenter implements Callback<CharacterDataWrapper> {

    private final ApiService mRetrofitApiService;

    HeroesListPresenter(ApiService retrofitApiService) {
        mRetrofitApiService = retrofitApiService;
    }

    void fetchCharacters() {
        mRetrofitApiService.fetchCharacters(this);
    }

    @Override
    public void onResponse(Call<CharacterDataWrapper> call, Response<CharacterDataWrapper> response) {
        Log.d("net", "onResponse");
    }

    @Override
    public void onFailure(Call<CharacterDataWrapper> call, Throwable t) {
        Log.d("net", "onFailure");
    }
}
