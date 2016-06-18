package com.arao.marvelheroes.app;

import android.content.Context;
import android.content.res.Resources;

public class AppModule {

    public static Context appContext() {
        return MarvelHeroesApplication.getContext();
    }

    public static Resources resources() {
        return appContext().getResources();
    }

}
