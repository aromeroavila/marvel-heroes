package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.model.ComicDataContainer;
import com.arao.marvelheroes.app.presenter.DataPersistor;
import com.arao.marvelheroes.master.view.ComicListUi;
import com.arao.marvelheroes.net.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

class ComicListPresenter implements Callback<CharacterDataWrapper> {

    private static final String CAPTAIN_AMERICA_ID = "1009220";

    private final ApiService mRetrofitApiService;

    private ComicListUi mComicListUi;
    private DataPersistor<List<Comic>> mDataPersistor;

    ComicListPresenter(ApiService retrofitApiService) {
        mRetrofitApiService = retrofitApiService;
    }

    void init(ComicListUi comicListUi, DataPersistor<List<Comic>> dataPersistor, List<Comic> savedComics) {
        mComicListUi = comicListUi;
        mDataPersistor = dataPersistor;

        if (savedComics == null) {
            fetchComics();
        } else {
            setData(savedComics);
        }
    }

    private void fetchComics() {
        mRetrofitApiService.fetchComicsFromCharacter(CAPTAIN_AMERICA_ID, this);
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
            List<Comic> comics = data.getComics();
            mDataPersistor.persistData(comics);
            setData(comics);
        } else {
            displayError();
        }
    }

    private void setData(List<Comic> comics) {
        mComicListUi.setComics(comics);
    }

    private void displayError() {
        mComicListUi.showError(true);
    }
}
