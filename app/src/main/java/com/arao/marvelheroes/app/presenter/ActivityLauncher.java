package com.arao.marvelheroes.app.presenter;

import android.app.Activity;
import android.content.Intent;

import com.arao.marvelheroes.detail.ComicActivity;
import com.arao.marvelheroes.master.model.Result;

public class ActivityLauncher {

    public void launchComicActivity(Activity sourceActivity, Result hero) {
        Intent comicIntent = new Intent(sourceActivity, ComicActivity.class);
        sourceActivity.startActivity(comicIntent);
    }

}
