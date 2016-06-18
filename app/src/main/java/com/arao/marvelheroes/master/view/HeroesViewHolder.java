package com.arao.marvelheroes.master.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.arao.marvelheroes.R;

class HeroesViewHolder extends RecyclerView.ViewHolder {

    TextView mHeroName;
    ImageView mHeroImage;

    HeroesViewHolder(View itemView) {
        super(itemView);

        mHeroName = (TextView) itemView.findViewById(R.id.hero_name);
        mHeroImage = (ImageView) itemView.findViewById(R.id.hero_image);
    }
}
