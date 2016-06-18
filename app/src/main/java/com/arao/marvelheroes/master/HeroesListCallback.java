package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.presenter.ActivityPresenter;
import com.arao.marvelheroes.master.model.CharacterDataWrapper;

public interface HeroesListCallback extends ActivityPresenter {

    void onHeroesReceived(CharacterDataWrapper characterDataWrapper);

}
