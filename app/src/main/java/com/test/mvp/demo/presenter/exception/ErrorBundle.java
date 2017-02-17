package com.test.mvp.demo.presenter.exception;

/**
 * Created by Arun Pillai on 2/17/2017.
 */

public interface ErrorBundle {
    /**
     * Provide what exception occured.
     *
     * @return exception
     */
    Exception getException();

    /**
     * Getting the error message attached to the exception
     *
     * @return error message
     */
    String getErrorMessage();
}
