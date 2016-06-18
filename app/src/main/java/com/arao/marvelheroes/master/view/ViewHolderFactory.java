package com.arao.marvelheroes.master.view;

import android.view.View;

class ViewHolderFactory {

    HeroesViewHolder createHeroesViewHolder(View view) {
        return new HeroesViewHolder(view);
    }

}
