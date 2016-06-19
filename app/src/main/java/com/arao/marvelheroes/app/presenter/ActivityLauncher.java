package com.arao.marvelheroes.app.presenter;

import android.app.Activity;
import android.content.Intent;

import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.detail.ComicActivity;

public class ActivityLauncher {

    public void launchComicActivity(Activity sourceActivity, Comic comic) {
        Intent comicIntent = new Intent(sourceActivity, ComicActivity.class);
        comicIntent.putExtra(ComicActivity.COMIC_EXTRA, comic);
        sourceActivity.startActivity(comicIntent);
    }

}
