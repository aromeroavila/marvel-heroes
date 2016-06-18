package com.arao.marvelheroes.master.view;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import static com.arao.marvelheroes.app.AppModule.appContext;
import static com.arao.marvelheroes.app.AppModule.resources;

public class ViewModule {

    public static HeroesListUi heroesListUi() {
        return new HeroesListUi(heroesAdapter(),
                defaultItemAnimator(),
                heroesItemDecoration(),
                heroesLayoutManager());
    }

    private static HeroesAdapter heroesAdapter() {
        return new HeroesAdapter(viewHolderFactory(), picasso());
    }

    private static RecyclerView.ItemAnimator defaultItemAnimator() {
        return new DefaultItemAnimator();
    }

    private static RecyclerView.ItemDecoration heroesItemDecoration() {
        return new HeroesItemDecoration(resources());
    }

    private static RecyclerView.LayoutManager heroesLayoutManager() {
        return new GridLayoutManager(appContext(), HeroesListUi.CARDS_PER_ROW);
    }

    private static ViewHolderFactory viewHolderFactory() {
        return new ViewHolderFactory();
    }

    private static Picasso picasso() {
        return Picasso.with(appContext());
    }

}
