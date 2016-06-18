package com.arao.marvelheroes.master;

import com.arao.marvelheroes.master.model.CharacterDataWrapper;
import com.arao.marvelheroes.net.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class HeroesListPresenter implements Callback<CharacterDataWrapper> {

    private final ApiService mRetrofitApiService;

    private HeroesListCallback mCallback;

    HeroesListPresenter(ApiService retrofitApiService) {
        mRetrofitApiService = retrofitApiService;
    }

    void setCallBack(HeroesListCallback callback) {
        mCallback = callback;
    }

    void fetchCharacters() {
        mRetrofitApiService.fetchCharacters(this);
    }

    @Override
    public void onResponse(Call<CharacterDataWrapper> call, Response<CharacterDataWrapper> response) {
        if (response.isSuccessful()) {
            mCallback.onHeroesReceived(response.body());
        } else {
            mCallback.onErrorFetchingHeroes();
        }
    }

    @Override
    public void onFailure(Call<CharacterDataWrapper> call, Throwable t) {
        mCallback.onErrorFetchingHeroes();
    }
}
