package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;
import com.arao.marvelheroes.master.model.Result;

import java.util.List;

public class HeroesListUi {

    static final int CARDS_PER_ROW = 2;

    private final HeroesAdapter mHeroesAdapter;
    private final RecyclerView.ItemAnimator mItemAnimator;
    private final RecyclerView.ItemDecoration mItemDecoration;
    private final RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mHeroesRecycler;
    private LinearLayout mLoadingLayout;

    HeroesListUi(HeroesAdapter heroesAdapter,
                 RecyclerView.ItemAnimator itemAnimator,
                 RecyclerView.ItemDecoration itemDecoration,
                 RecyclerView.LayoutManager layoutManager) {
        mHeroesAdapter = heroesAdapter;
        mItemAnimator = itemAnimator;
        mItemDecoration = itemDecoration;
        mLayoutManager = layoutManager;
    }

    public void createView(ActivityPresenter activityController) {
        activityController.setContentView(R.layout.activity_heroes_list);

        Toolbar toolbar = (Toolbar) activityController.findViewById(R.id.toolbar);
        mHeroesRecycler = (RecyclerView) activityController.findViewById(R.id.heroes_recycler);
        mLoadingLayout = (LinearLayout) activityController.findViewById(R.id.loading_layout);

        initToolbar(toolbar);
        setupRecyclerView();
    }

    public void setLoading(boolean loading) {
        mLoadingLayout.setVisibility(loading ? View.VISIBLE : View.GONE);
        mHeroesRecycler.setVisibility(loading ? View.GONE : View.VISIBLE);
    }

    public void setHeroes(List<Result> heroList) {
        mHeroesAdapter.setData(heroList);
    }

    private void initToolbar(Toolbar toolbar) {
        toolbar.setTitle(R.string.app_name);
    }

    private void setupRecyclerView() {
        mHeroesRecycler.setLayoutManager(mLayoutManager);
        mHeroesRecycler.setItemAnimator(mItemAnimator);
        mHeroesRecycler.addItemDecoration(mItemDecoration);
        mHeroesRecycler.setAdapter(mHeroesAdapter);
    }

}
