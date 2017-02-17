package com.test.mvp.demo.interactor.impl;

import android.os.AsyncTask;

import com.test.mvp.demo.dao.IUserDAO;
import com.test.mvp.demo.dao.impl.SharedPreferenceUserDAO;
import com.test.mvp.demo.dto.UserDTO;
import com.test.mvp.demo.interactor.ILoginInteractor;
import com.test.mvp.demo.listeners.OnFinishLoginListener;
import com.test.mvp.demo.presenter.exception.DefaultErrorBundle;

/**
 * Implementation of LoginInteractor.
 * Created by Arun Pillai on 2/16/2017.
 */

public class LoginInteractorImpl implements ILoginInteractor {

    IUserDAO userDao;

    public LoginInteractorImpl() {
        this.userDao = new SharedPreferenceUserDAO();
    }

    @Override
    public void doLogin(final String userName, final String password, final OnFinishLoginListener onFinishLoginListener) {

        AsyncTask<Void, Void, Void> asyncTask = new AsyncTask<Void, Void, Void>() {
            UserDTO userDTO;
            Exception exception;
            @Override
            protected Void doInBackground(Void... voids) {
                try {
                    synchronized (this) {
                        wait(2000);
                    }
                    userDTO = new UserDTO();
                    userDTO.setEmail(userName);
                    userDTO.setMobileNumber("8411001998");
                    userDTO.setAuthToken("FQPO-FRWOF894-534NR43-KJNR40-94JKKJN-RF83R");
                    userDTO.setUserID(122);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    this.exception = e;
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                if(exception != null){
                    onFinishLoginListener.onError(new DefaultErrorBundle(exception));
                } else if(userDTO != null){
                    onFinishLoginListener.onSuccess(userDTO);
                    userDao.saveUserDetails(userDTO);
                }
            }
        };
        asyncTask.execute();
    }
}
