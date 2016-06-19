package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.presenter.ActivityLauncher;
import com.arao.marvelheroes.app.presenter.DataPersistor;
import com.arao.marvelheroes.master.view.ComicListUi;

import java.util.ArrayList;
import java.util.List;

import static com.arao.marvelheroes.app.presenter.PresenterModule.activityLauncher;
import static com.arao.marvelheroes.master.MasterModule.comicListPresenter;
import static com.arao.marvelheroes.master.view.ViewModule.comicListUi;

public class ComicListActivity extends AppCompatActivity implements ComicListCallback,
        DataPersistor<List<Comic>> {

    private final static String COMICS_EXTRA = "comics_extra";

    private final ComicListPresenter mComicListPresenter;
    private final ComicListUi mComicListUi;
    private final ActivityLauncher mActivityLauncher;

    private List<Comic> mFetchedComics;

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

        if (savedInstanceState != null) {
            mFetchedComics = savedInstanceState.getParcelableArrayList(COMICS_EXTRA);
        }

        mComicListUi.createView(this, this);
        mComicListPresenter.init(mComicListUi, this, mFetchedComics);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putParcelableArrayList(COMICS_EXTRA, new ArrayList<Parcelable>(mFetchedComics));
    }

    @Override
    public void onComicClicked(Comic comic) {
        mActivityLauncher.launchComicActivity(this, comic);
    }

    @Override
    public void persistData(List<Comic> data) {
        mFetchedComics = data;
    }
}
