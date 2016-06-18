package com.arao.marvelheroes.master.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.arao.marvelheroes.R;

class HeroesItemDecoration extends RecyclerView.ItemDecoration {

    private Resources mResources;

    HeroesItemDecoration(Resources resources) {
        mResources = resources;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        final int horizontalOffset = mResources.getDimensionPixelOffset(R.dimen.x_small);

        outRect.bottom = mResources.getDimensionPixelOffset(R.dimen.small);
        outRect.left = horizontalOffset;
        outRect.right = horizontalOffset;
    }

}
