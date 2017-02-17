package com.test.mvp.demo.interactor;

import com.test.mvp.demo.listeners.OnFinishLoginListener;

/**
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginInteractor {

    void doLogin(String userName, String password, OnFinishLoginListener onFinishLoginListener);

}
