package com.arao.marvelheroes.net;

import com.arao.marvelheroes.utils.EncryptionManager;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

class AuthManager {

    private static final String TS = "ts";
    private static final String API_KEY = "apikey";
    private static final String HASH = "hash";
    private static final String PUBLIC_KEY = "6a7ed890b4b941a925202a5630d5b162";
    private static final String PRIVATE_KEY = "0f1d0fdf46a0bf32f962b0b9997233c0395cdf8e";

    private final EncryptionManager mEncryptionManager;

    AuthManager(EncryptionManager encryptionManager) {
        mEncryptionManager = encryptionManager;
    }

    Map<String, String> getAuthParams() {
        Map<String, String> authParams = new HashMap<>();

        String ts = getRandomTs();
        String md5 = mEncryptionManager.md5(ts + PRIVATE_KEY + PUBLIC_KEY);

        authParams.put(TS, ts);
        authParams.put(API_KEY, PUBLIC_KEY);
        authParams.put(HASH, md5);

        return authParams;
    }

    private String getRandomTs() {
        SecureRandom random = new SecureRandom();
        return new BigInteger(130, random).toString(32);
    }

}
