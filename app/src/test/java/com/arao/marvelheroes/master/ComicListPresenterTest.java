package com.arao.marvelheroes.master;

import com.arao.marvelheroes.app.model.CharacterDataWrapper;
import com.arao.marvelheroes.app.model.Comic;
import com.arao.marvelheroes.app.presenter.DataPersistor;
import com.arao.marvelheroes.master.view.ComicListUi;
import com.arao.marvelheroes.net.ApiService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import retrofit2.Call;

import static org.mockito.Answers.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class ComicListPresenterTest {

    @Mock
    private ApiService apiService;

    @Mock
    private ComicListUi comicListUi;

    @Mock
    private DataPersistor<List<Comic>> dataPersistor;

    @Mock
    private Call<CharacterDataWrapper> call;

    @Mock
    private List<Comic> comics;

//    @Mock
//    private Response<CharacterDataWrapper> response;

    @Mock
    private Throwable throwable;

    @Mock(answer = RETURNS_DEEP_STUBS)
    private CharacterDataWrapper characterDataWrapper;

    private ComicListPresenter comicListPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        comicListPresenter = new ComicListPresenter(apiService);
    }

    @Test
    public void whenInitWithNullData_thenComicsAreFetched() throws Exception {
        comicListPresenter.init(comicListUi, dataPersistor, null);

        verify(apiService).fetchComicsOfCharacter("1009220", comicListPresenter);
    }

    @Test
    public void whenInitWithData_thenComicsAreFetched() throws Exception {
        comicListPresenter.init(comicListUi, dataPersistor, comics);

        verify(apiService, never()).fetchComicsOfCharacter("1009220", comicListPresenter);
        verify(comicListUi).setComics(comics);
    }

    // TODO: Create custom callbacks to stop dependencies with Retrofit code so this could be
    // tested
//    @Test
//    public void whenSuccessfulResponseReceived_thenComicsAreSetToUi() throws Exception {
//        when(response.isSuccessful()).thenReturn(true);
//        when(response.body()).thenReturn(characterDataWrapper);
//
//        comicListPresenter.onResponse(call, response);
//
//        //noinspection unchecked
//        verify(comicListUi).setComics(anyList());
//    }

    @Test
    public void whenOnFailure_thenUiDisplaysError() throws Exception {
        comicListPresenter.init(comicListUi, dataPersistor, null);

        comicListPresenter.onFailure(call, throwable);

        verify(comicListUi).showError(true);
    }

}