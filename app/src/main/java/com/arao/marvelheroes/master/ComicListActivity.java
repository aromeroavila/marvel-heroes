package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.model.Comic;
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

        mComicListUi.createView(this, this);
        mComicListPresenter.init(mComicListUi);
    }

    @Override
    public void onComicClicked(Comic comic) {
        mActivityLauncher.launchComicActivity(this, comic);
    }

}
