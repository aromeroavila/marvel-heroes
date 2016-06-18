package com.arao.marvelheroes.master;

import static com.arao.marvelheroes.net.NetModule.apiService;

class MasterModule {

    static ComicListPresenter comicListPresenter() {
        return new ComicListPresenter(apiService());
    }

}
