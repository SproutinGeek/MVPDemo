package com.test.mvp.demo.dto;

import java.io.Serializable;

/**
 * Serializable data transfer object for user details.
 * Created by Arun Pillai on 2/16/2017.
 */

public class UserDTO implements Serializable{

    private int userID;
    private String email;
    private String authToken;
    private String mobileNumber;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
