package com.arao.marvelheroes.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.arao.marvelheroes.utils.UtilsModule.encryptionManager;

public class NetModule {

    public static ApiService apiService() {
        return RetrofitApiService.getApiService(retrofit(), authManager());
    }

    private static AuthManager authManager() {
        return new AuthManager(encryptionManager());
    }

    private static Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(RetrofitApiService.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
