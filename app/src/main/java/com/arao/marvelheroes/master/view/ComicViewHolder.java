package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arao.marvelheroes.R;

class ComicViewHolder extends RecyclerView.ViewHolder {

    TextView mComicName;
    ImageView mComicImage;

    ComicViewHolder(View itemView) {
        super(itemView);

        mComicName = (TextView) itemView.findViewById(R.id.hero_name);
        mComicImage = (ImageView) itemView.findViewById(R.id.hero_image);
    }
}
