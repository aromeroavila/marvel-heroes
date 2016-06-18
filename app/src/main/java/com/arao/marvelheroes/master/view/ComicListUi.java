package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;
import com.arao.marvelheroes.master.ComicListCallback;

import java.util.List;

public class ComicListUi {

    static final int CARDS_PER_ROW = 2;

    private final ComicsAdapter mComicsAdapter;
    private final RecyclerView.ItemAnimator mItemAnimator;
    private final RecyclerView.ItemDecoration mItemDecoration;
    private final RecyclerView.LayoutManager mLayoutManager;

    private RecyclerView mComicsRecycler;
    private LinearLayout mLoadingLayout;
    private TextView mErrorTextView;
    private ComicListCallback mCallback;

    ComicListUi(ComicsAdapter comicsAdapter,
                RecyclerView.ItemAnimator itemAnimator,
                RecyclerView.ItemDecoration itemDecoration,
                RecyclerView.LayoutManager layoutManager) {
        mComicsAdapter = comicsAdapter;
        mItemAnimator = itemAnimator;
        mItemDecoration = itemDecoration;
        mLayoutManager = layoutManager;
    }

    public void createView(ActivityPresenter activityController) {
        activityController.setContentView(R.layout.activity_comics_list);

        Toolbar toolbar = (Toolbar) activityController.findViewById(R.id.toolbar);
        mComicsRecycler = (RecyclerView) activityController.findViewById(R.id.comics_recycler);
        mLoadingLayout = (LinearLayout) activityController.findViewById(R.id.loading_layout);
        mErrorTextView = (TextView) activityController.findViewById(R.id.error_view);

        initToolbar(toolbar);
        setupRecyclerView();
    }

    public void setCallBack(ComicListCallback callBack) {
        mCallback = callBack;
    }

    public void setLoading(boolean loading) {
        mLoadingLayout.setVisibility(loading ? View.VISIBLE : View.GONE);
        mComicsRecycler.setVisibility(loading ? View.GONE : View.VISIBLE);
    }

    public void showError(boolean error) {
        mErrorTextView.setVisibility(error ? View.VISIBLE : View.GONE);
        mComicsRecycler.setVisibility(error ? View.GONE : View.VISIBLE);
    }

    public void setComics(List<Comic> comics) {
        mErrorTextView.setVisibility(View.GONE);
        mLoadingLayout.setVisibility(View.GONE);
        mComicsRecycler.setVisibility(View.VISIBLE);
        mComicsAdapter.setData(comics);
    }

    private void initToolbar(Toolbar toolbar) {
        toolbar.setTitle(R.string.app_name);
    }

    private void setupRecyclerView() {
        mComicsAdapter.setPresenterCallback(mCallback);
        mComicsRecycler.setLayoutManager(mLayoutManager);
        mComicsRecycler.setItemAnimator(mItemAnimator);
        mComicsRecycler.addItemDecoration(mItemDecoration);
        mComicsRecycler.setAdapter(mComicsAdapter);
    }
}
