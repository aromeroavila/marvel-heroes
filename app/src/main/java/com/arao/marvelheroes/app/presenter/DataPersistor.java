package com.arao.marvelheroes.app.presenter;

public interface DataPersistor<T> {

    void persistData(T data);

}
