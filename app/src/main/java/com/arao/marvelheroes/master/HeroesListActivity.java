package com.arao.marvelheroes.master;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.arao.marvelheroes.app.presenter.ActivityLauncher;
import com.arao.marvelheroes.master.model.CharacterDataWrapper;
import com.arao.marvelheroes.master.model.Data;
import com.arao.marvelheroes.master.model.Result;
import com.arao.marvelheroes.master.view.HeroesListUi;

import static com.arao.marvelheroes.app.presenter.PresenterModule.activityLauncher;
import static com.arao.marvelheroes.master.MasterModule.heroesListPresenter;
import static com.arao.marvelheroes.master.view.ViewModule.heroesListUi;

public class HeroesListActivity extends AppCompatActivity implements HeroesListCallback {

    private final HeroesListPresenter mHeroesListPresenter;
    private final HeroesListUi mHeroesListUi;
    private final ActivityLauncher mActivityLauncher;

    @SuppressWarnings("unused")
    public HeroesListActivity() {
        this(heroesListPresenter(), heroesListUi(), activityLauncher());
    }

    private HeroesListActivity(HeroesListPresenter heroesListPresenter,
                               HeroesListUi heroesListUi,
                               ActivityLauncher activityLauncher) {
        mHeroesListPresenter = heroesListPresenter;
        mHeroesListUi = heroesListUi;
        mActivityLauncher = activityLauncher;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mHeroesListUi.setCallBack(this);
        mHeroesListUi.createView(this);
        mHeroesListPresenter.setCallBack(this);
        mHeroesListPresenter.fetchCharacters();
    }

    @Override
    public void onHeroesReceived(CharacterDataWrapper characterDataWrapper) {
        Data data = characterDataWrapper.getData();
        if (data != null && data.getResults() != null) {
            mHeroesListUi.showError(false);
            mHeroesListUi.setLoading(false);
            mHeroesListUi.setHeroes(data.getResults());
        } else {
            displayError();
        }
    }

    @Override
    public void onErrorFetchingHeroes() {
        displayError();
    }

    @Override
    public void onHeroClicked(Result hero) {
        mActivityLauncher.launchComicActivity(this, hero);
    }

    private void displayError() {
        mHeroesListUi.setLoading(false);
        mHeroesListUi.showError(true);
    }

}
