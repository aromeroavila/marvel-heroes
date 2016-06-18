package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.presenter.ActivityPresenter;

import static com.arao.marvelheroes.master.MasterModule.heroesListPresenter;
import static com.arao.marvelheroes.master.MasterModule.heroesListUi;

public class HeroesListActivity extends AppCompatActivity implements ActivityPresenter {

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
        mHeroesListPresenter.fetchCharacters();
    }
}
