package com.test.mvp.demo.listeners;

import com.test.mvp.demo.dto.UserDTO;

/**
 * Created by Arun Pillai on 2/17/2017.
 */

public interface OnFinishLoginListener {

    void onSuccess(UserDTO userDTO);

    void onError(Exception e);

}
