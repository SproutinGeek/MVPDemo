package com.test.mvp.demo.ui.view;

import android.support.annotation.StringRes;

import com.test.mvp.demo.dto.UserDTO;

/**
 * View interface for the presenter to interact.
 * Created by Arun Pillai on 2/16/2017.
 */

public interface ILoginView {
    /**
     * Show user name error happened.
     *
     * @param errorMessage
     */
    void showUserNameError(@StringRes int errorMessage);

    /**
     * Show the passoword data error.
     *
     * @param username_empty
     */
    void showPasswordError(@StringRes int username_empty);

    /**
     * Show progress dialoge in the screen while processing some request.
     */
    void showProgress();

    /**
     * Dismiss the popup.
     */
    void dismissProgress();

    /**
     * Navigate to the other screens, as per the logic
     * @param userDTO
     */
    void navigateToList(UserDTO userDTO);
}
