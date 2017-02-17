package com.test.mvp.demo.presenter.impl;

import android.text.TextUtils;

import com.test.mvp.demo.R;
import com.test.mvp.demo.dto.UserDTO;
import com.test.mvp.demo.interactor.ILoginInteractor;
import com.test.mvp.demo.interactor.impl.LoginInteractorImpl;
import com.test.mvp.demo.listeners.OnFinishLoginListener;
import com.test.mvp.demo.presenter.ILoginPresenter;
import com.test.mvp.demo.ui.view.ILoginView;

/**
 * Created by Arun Pillai on 2/16/2017.
 */

public class LoginPresenterImpl implements ILoginPresenter, OnFinishLoginListener {
    private ILoginView loginView;
    private ILoginInteractor loginInteractor;

    public LoginPresenterImpl(ILoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void doLogin(CharSequence username, CharSequence password) {

        if(validateInputs(username, password)){
            loginView.showProgress();
            loginInteractor.doLogin(username.toString(), password.toString(), this);
        }
    }

    @Override
    public boolean validateInputs(CharSequence username, CharSequence password) {
        boolean validate = true;
        if(TextUtils.isEmpty(username)){
            validate = false;
            loginView.showUserNameError(R.string.username_empty);
        }else if (!username.toString().contains("@")){
            validate = false;
            loginView.showUserNameError(R.string.username_email);
        }
        if(TextUtils.isEmpty(username)){
            validate = false;
            loginView.showPasswordError(R.string.password_empty);
        }
        return validate;
    }

    @Override
    public void onSuccess(UserDTO userDTO) {
        loginView.dismissProgress();
    }

    @Override
    public void onError(Exception e) {
        loginView.dismissProgress();
    }
}
