package com.arao.marvelheroes.app;

import android.app.Application;
import android.content.Context;

public class MarvelHeroesApplication extends Application {

    private static MarvelHeroesApplication instance;

    public MarvelHeroesApplication() {
        instance = this;
    }

    static Context getContext() {
        return instance.getApplicationContext();
    }

}
