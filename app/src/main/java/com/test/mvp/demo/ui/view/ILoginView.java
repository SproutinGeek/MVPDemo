package com.test.mvp.demo.ui.view;

import android.support.annotation.StringRes;

import com.test.mvp.demo.dto.UserDTO;

/**
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginView {

    void showUserNameError(@StringRes int errorMessage);

    void showPasswordError(int username_empty);

    void showProgress();

    void dismissProgress();

    void navigateToList(UserDTO userDTO);
}
