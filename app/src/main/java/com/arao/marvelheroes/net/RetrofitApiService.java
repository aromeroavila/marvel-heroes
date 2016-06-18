package com.arao.marvelheroes.net;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

class RetrofitApiService implements ApiService {

    static final String BASE_URL = "http://gateway.marvel.com";

    private static RetrofitApiService mInstance;

    private final Retrofit mRetrofit;
    private final AuthManager mAuthManager;

    private RetrofitApiService(Retrofit retrofit, AuthManager authManager) {
        mAuthManager = authManager;
        mRetrofit = retrofit;
    }

    static RetrofitApiService getApiService(Retrofit retrofit, AuthManager authManager) {
        if (mInstance == null) {
            mInstance = new RetrofitApiService(retrofit, authManager);
        }
        return mInstance;
    }

    @Override
    public void fetchComicsOfCharacter(String characterId, Callback<CharacterDataWrapper> callback) {
        MarvelEndpoints service = mRetrofit.create(MarvelEndpoints.class);
        Call<CharacterDataWrapper> charactersCall =
                service.getCharacters(characterId, mAuthManager.getAuthParams());
        charactersCall.enqueue(callback);
    }

}
