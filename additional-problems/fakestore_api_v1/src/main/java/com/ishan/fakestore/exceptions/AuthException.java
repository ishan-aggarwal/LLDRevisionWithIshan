package com.ishan.fakestore.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class AuthException extends RuntimeException {

    public AuthException(String message) {
        super(message);
    }

}