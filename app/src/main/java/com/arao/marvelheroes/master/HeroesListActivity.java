package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.master.model.CharacterDataWrapper;
import com.arao.marvelheroes.master.model.Data;
import com.arao.marvelheroes.master.view.HeroesListUi;

import static com.arao.marvelheroes.master.MasterModule.heroesListPresenter;
import static com.arao.marvelheroes.master.view.ViewModule.heroesListUi;

public class HeroesListActivity extends AppCompatActivity implements HeroesListCallback {

    private final HeroesListPresenter mHeroesListPresenter;
    private final HeroesListUi mHeroesListUi;

    @SuppressWarnings("unused")
    public HeroesListActivity() {
        this(heroesListPresenter(), heroesListUi());
    }

    private HeroesListActivity(HeroesListPresenter heroesListPresenter, HeroesListUi heroesListUi) {
        mHeroesListPresenter = heroesListPresenter;
        mHeroesListUi = heroesListUi;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mHeroesListUi.createView(this);
        mHeroesListPresenter.setCallBack(this);
        mHeroesListPresenter.fetchCharacters();
    }

    @Override
    public void onHeroesReceived(CharacterDataWrapper characterDataWrapper) {
        Data data = characterDataWrapper.getData();
        if (data != null && data.getResults() != null) {
            mHeroesListUi.setLoading(false);
            mHeroesListUi.setHeroes(data.getResults());
        } else {
            // display error
        }
    }
}
