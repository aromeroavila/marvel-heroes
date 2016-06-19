package com.arao.marvelheroes.master.view;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import static com.arao.marvelheroes.app.AppModule.appContext;
import static com.arao.marvelheroes.app.AppModule.resources;

public class ViewModule {

    public static ComicListUi comicListUi() {
        return new ComicListUi(comicsAdapter(),
                defaultItemAnimator(),
                comicItemDecoration(),
                comicsLayoutManager());
    }

    public static Picasso picasso() {
        return Picasso.with(appContext());
    }

    private static ComicsAdapter comicsAdapter() {
        return new ComicsAdapter(viewHolderFactory(), picasso());
    }

    private static RecyclerView.ItemAnimator defaultItemAnimator() {
        return new DefaultItemAnimator();
    }

    private static RecyclerView.ItemDecoration comicItemDecoration() {
        return new ComicItemDecoration(resources());
    }

    private static RecyclerView.LayoutManager comicsLayoutManager() {
        return new GridLayoutManager(appContext(), ComicListUi.CARDS_PER_ROW);
    }

    private static ViewHolderFactory viewHolderFactory() {
        return new ViewHolderFactory();
    }

}
