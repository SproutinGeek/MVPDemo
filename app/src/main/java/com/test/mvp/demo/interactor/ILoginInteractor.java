package com.test.mvp.demo.interactor;

import com.test.mvp.demo.listeners.OnFinishLoginListener;

/**
 * Interactor interface for service and data interactions.
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginInteractor {
    /**
     * Login service call with saving in storage.
     *
     * @param userName
     * @param password
     * @param onFinishLoginListener
     */
    void doLogin(String userName, String password, OnFinishLoginListener onFinishLoginListener);

}
