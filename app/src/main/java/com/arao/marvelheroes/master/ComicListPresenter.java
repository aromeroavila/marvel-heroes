package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;
import com.arao.marvelheroes.app.model.ComicDataContainer;
import com.arao.marvelheroes.master.view.ComicListUi;
import com.arao.marvelheroes.net.ApiService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class ComicListPresenter implements Callback<CharacterDataWrapper> {

    private static final String CAPTAIN_AMERICA_ID = "1009220";

    private final ApiService mRetrofitApiService;

    private ComicListUi mComicListUi;

    ComicListPresenter(ApiService retrofitApiService) {
        mRetrofitApiService = retrofitApiService;
    }

    void init(ComicListUi comicListUi) {
        mComicListUi = comicListUi;
        fetchComics();
    }

    private void fetchComics() {
        mRetrofitApiService.fetchComicsOfCharacter(CAPTAIN_AMERICA_ID, this);
    }

    @Override
    public void onResponse(Call<CharacterDataWrapper> call, Response<CharacterDataWrapper> response) {
        if (response.isSuccessful()) {
            onComicsReceived(response.body());
        } else {
            displayError();
        }
    }

    @Override
    public void onFailure(Call<CharacterDataWrapper> call, Throwable t) {
        displayError();
    }

    private void onComicsReceived(CharacterDataWrapper characterDataWrapper) {
        ComicDataContainer data = characterDataWrapper.getComicDataContainer();
        if (data != null && data.getComics() != null) {
            mComicListUi.setComics(data.getComics());
        } else {
            displayError();
        }
    }

    private void displayError() {
        mComicListUi.setLoading(false);
        mComicListUi.showError(true);
    }
}
