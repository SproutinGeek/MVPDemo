package com.test.mvp.demo.ui.exception;

import android.support.annotation.StringRes;

import com.test.mvp.demo.R;
import com.test.mvp.demo.presenter.exception.ErrorBundle;

/**
 * Create the proper messages to show in screen for each exception
 * Created by Arun Pillai on 2/17/2017.
 */

public class ExceptionMessageFactory {

    public static
    @StringRes
    int getErrorMessage(ErrorBundle errorBundle) {

        return R.string.default_error;
    }
}
