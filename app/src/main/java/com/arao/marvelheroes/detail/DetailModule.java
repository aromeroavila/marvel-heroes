package com.arao.marvelheroes.detail;

import static com.arao.marvelheroes.master.view.ViewModule.picasso;

class DetailModule {

    static ComicUi comicUi() {
        return new ComicUi(picasso());
    }

}
