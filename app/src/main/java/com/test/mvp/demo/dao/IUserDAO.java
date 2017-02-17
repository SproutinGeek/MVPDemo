package com.test.mvp.demo.dao;

import com.test.mvp.demo.dto.UserDTO;

/**
 * Created by Arun Pillai on 2/17/2017.
 */

public interface IUserDAO {
    /**
     * Store Logged in user details
     *
     * @param userDTO
     * @return
     */
    boolean saveUserDetails(UserDTO userDTO);
}
