package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.model.ComicDataContainer;
import com.arao.marvelheroes.app.presenter.ActivityLauncher;
import com.arao.marvelheroes.master.view.ComicListUi;

import static com.arao.marvelheroes.app.presenter.PresenterModule.activityLauncher;
import static com.arao.marvelheroes.master.MasterModule.comicListPresenter;
import static com.arao.marvelheroes.master.view.ViewModule.comicListUi;

public class ComicListActivity extends AppCompatActivity implements ComicListCallback {

    private final ComicListPresenter mComicListPresenter;
    private final ComicListUi mComicListUi;
    private final ActivityLauncher mActivityLauncher;

    @SuppressWarnings("unused")
    public ComicListActivity() {
        this(comicListPresenter(), comicListUi(), activityLauncher());
    }

    private ComicListActivity(ComicListPresenter comicListPresenter,
                              ComicListUi comicListUi,
                              ActivityLauncher activityLauncher) {
        mComicListPresenter = comicListPresenter;
        mComicListUi = comicListUi;
        mActivityLauncher = activityLauncher;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mComicListUi.setCallBack(this);
        mComicListUi.createView(this);
        mComicListPresenter.setCallBack(this);
        mComicListPresenter.fetchComics();
    }

    @Override
    public void onComicsReceived(CharacterDataWrapper characterDataWrapper) {
        ComicDataContainer data = characterDataWrapper.getComicDataContainer();
        if (data != null && data.getComics() != null) {
            mComicListUi.setComics(data.getComics());
        } else {
            displayError();
        }
    }

    @Override
    public void onErrorFetchingComics() {
        displayError();
    }

    @Override
    public void onComicClicked(Comic comic) {
        mActivityLauncher.launchComicActivity(this, comic);
    }

    private void displayError() {
        mComicListUi.setLoading(false);
        mComicListUi.showError(true);
    }

}
