package com.arao.marvelheroes.detail;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arao.marvelheroes.R;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.model.Image;
import com.arao.marvelheroes.app.presenter.ActivityPresenter;
import com.arao.marvelheroes.app.presenter.NavigationCallback;
import com.squareup.picasso.Picasso;

class ComicUi implements View.OnClickListener {

    private static final String EXTENSION_DOT = ".";

    private final Picasso mPicasso;

    private Toolbar mToolbar;
    private TextView mComicTitle;
    private TextView mComicDescription;
    private ImageView mComicImage;
    private NavigationCallback mNavigationCallback;

    ComicUi(Picasso picasso) {
        mPicasso = picasso;
    }

    void createView(ActivityPresenter activityPresenter, NavigationCallback navigationCallback, Comic comic) {
        activityPresenter.setContentView(R.layout.activity_comic);
        mNavigationCallback = navigationCallback;

        mToolbar = (Toolbar) activityPresenter.findViewById(R.id.toolbar);
        mComicTitle = (TextView) activityPresenter.findViewById(R.id.comic_title);
        mComicDescription = (TextView) activityPresenter.findViewById(R.id.comic_description);
        mComicImage = (ImageView) activityPresenter.findViewById(R.id.comic_image);

        initToolbar();
        setData(comic);
    }

    @Override
    public void onClick(View view) {
        mNavigationCallback.onUpPressed();
    }

    private void initToolbar() {
        mToolbar.setTitle(R.string.comic_title);
        mToolbar.setNavigationIcon(R.drawable.ic_up);
        mToolbar.setNavigationOnClickListener(this);
    }

    private void setData(Comic comic) {
        Image image = comic.getImages().get(0);
        mComicTitle.setText(comic.getTitle());
        mComicDescription.setText(comic.getDescription());
        mPicasso.load(image.getPath() + EXTENSION_DOT + image.getExtension())
                .placeholder(R.mipmap.comics_list_placeholder)
                .into(mComicImage);
    }

}
