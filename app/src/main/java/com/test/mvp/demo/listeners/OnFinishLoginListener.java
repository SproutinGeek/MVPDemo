package com.test.mvp.demo.listeners;

import com.test.mvp.demo.dto.UserDTO;
import com.test.mvp.demo.presenter.exception.ErrorBundle;

/**
 * On finish listener for the login bussiness request.
 * Created by Arun Pillai on 2/17/2017.
 */

public interface OnFinishLoginListener {
    /**
     * On success of login interaction with server
     *
     * @param userDTO user data received.
     */
    void onSuccess(UserDTO userDTO);

    /**
     * On error of login intractions.
     * @param e
     */
    void onError(ErrorBundle e);

}
