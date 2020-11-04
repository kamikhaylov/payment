package ru.bank.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class WebInternalErrorException extends RuntimeException {
    public WebInternalErrorException() {
    }

    public WebInternalErrorException(String message) {
        super(message);
    }

    public WebInternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebInternalErrorException(Throwable cause) {
        super(cause);
    }

    public WebInternalErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
