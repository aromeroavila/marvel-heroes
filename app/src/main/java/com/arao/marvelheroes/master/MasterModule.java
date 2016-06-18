package com.arao.marvelheroes.master;

import static com.arao.marvelheroes.net.NetModule.apiService;

class MasterModule {

    static HeroesListPresenter heroesListPresenter() {
        return new HeroesListPresenter(apiService());
    }

}
