package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;
import com.arao.marvelheroes.net.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class ComicListPresenter implements Callback<CharacterDataWrapper> {

    private static final String CAPTAIN_AMERICA_ID = "1009220";

    private final ApiService mRetrofitApiService;

    private ComicListCallback mCallback;

    ComicListPresenter(ApiService retrofitApiService) {
        mRetrofitApiService = retrofitApiService;
    }

    void setCallBack(ComicListCallback callback) {
        mCallback = callback;
    }

    void fetchComics() {
        mRetrofitApiService.fetchComicsOfCharacter(CAPTAIN_AMERICA_ID, this);
    }

    @Override
    public void onResponse(Call<CharacterDataWrapper> call, Response<CharacterDataWrapper> response) {
        if (response.isSuccessful()) {
            mCallback.onComicsReceived(response.body());
        } else {
            mCallback.onErrorFetchingComics();
        }
    }

    @Override
    public void onFailure(Call<CharacterDataWrapper> call, Throwable t) {
        mCallback.onErrorFetchingComics();
    }
}
