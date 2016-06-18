package com.arao.marvelheroes.master;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;

class HeroesListUi {

    private RecyclerView mHeroesRecycler;
    private LinearLayout mLoadingLayout;

    void createView(ActivityPresenter activityController) {
        activityController.setContentView(R.layout.activity_heroes_list);

        Toolbar toolbar = (Toolbar) activityController.findViewById(R.id.toolbar);
        mHeroesRecycler = (RecyclerView) activityController.findViewById(R.id.heroes_recycler);
        mLoadingLayout = (LinearLayout) activityController.findViewById(R.id.loading_layout);

        initToolbar(toolbar);
    }

    private void initToolbar(Toolbar toolbar) {
        toolbar.setTitle(R.string.app_name);
    }

    public void setLoading(boolean loading) {
        mLoadingLayout.setVisibility(loading ? View.VISIBLE : View.GONE);
    }

}
