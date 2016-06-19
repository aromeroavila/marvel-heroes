package com.arao.marvelheroes.detail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;
import com.arao.marvelheroes.app.presenter.NavigationCallback;

import static com.arao.marvelheroes.detail.DetailModule.comicUi;

public class ComicActivity extends AppCompatActivity implements ActivityPresenter, NavigationCallback {

    public static final String COMIC_EXTRA = "comic_extra";

    private final ComicUi mComicUi;

    @SuppressWarnings("unused")
    public ComicActivity() {
        this(comicUi());
    }

    private ComicActivity(ComicUi comicUi) {
        mComicUi = comicUi;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mComicUi.createView(this, this, getComicFromExtras());
    }

    @Override
    public void onUpPressed() {
        finish();
    }

    private Comic getComicFromExtras() {
        Bundle extras = getIntent().getExtras();
        return extras.getParcelable(COMIC_EXTRA);
    }
}
