package com.test.mvp.demo.presenter;

/**
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginPresenter {
    void doLogin(CharSequence username, CharSequence password);
    boolean validateInputs(CharSequence username, CharSequence password);
}
