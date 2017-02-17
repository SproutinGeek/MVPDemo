package com.test.mvp.demo.presenter.exception;

/**
 * Created by Arun Pillai on 2/17/2017.
 */

public class DefaultErrorBundle implements ErrorBundle {
    private final Exception exception;

    /**
     * Constructor of DefaultErrorBundle
     *
     * @param exception
     */
    public DefaultErrorBundle(Exception exception) {
        this.exception = exception;
    }

    @Override
    public Exception getException() {
        return exception;
    }

    /**
     * Get error message
     *
     * @return error message
     */
    @Override
    public String getErrorMessage() {
        String message = "";
        if (this.exception != null) {
            this.exception.getMessage();
        }
        return message;
    }
}
