package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;

public interface ComicListCallback extends ActivityPresenter {

    void onComicClicked(Comic comic);
}
