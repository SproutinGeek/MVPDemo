package com.test.mvp.demo.dao.impl;

import android.content.Context;
import android.content.SharedPreferences;

import com.test.mvp.demo.DemoApplication;
import com.test.mvp.demo.R;
import com.test.mvp.demo.dao.IUserDAO;
import com.test.mvp.demo.dto.UserDTO;

/**
 * Persistent storage using shared preference.
 * Created by Arun Pillai on 2/17/2017.
 */

public class SharedPreferenceUserDAO implements IUserDAO {

    @Override
    public boolean saveUserDetails(UserDTO userDTO) {
        SharedPreferences.Editor editor = DemoApplication.getDemoApplication()
                .getSharedPreferences(DemoApplication.getDemoApplication().getString(R.string.app_name),
                        Context.MODE_PRIVATE).edit();
        editor.putString("userDTO", userDTO.toString());
        editor.commit();
        return false;
    }
}
