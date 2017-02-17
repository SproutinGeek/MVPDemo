package com.test.mvp.demo.presenter;

/**
 * Presenter calss responsible for all the ui
 * interaction and the bussiness logic for the application
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginPresenter {
    /**
     * Login with the provided details
     *
     * @param username
     * @param password
     */
    void doLogin(CharSequence username, CharSequence password);

    /**
     * Validate the inputs provided from the screen
     * @param username
     * @param password
     * @return
     */
    boolean validateInputs(CharSequence username, CharSequence password);
}
