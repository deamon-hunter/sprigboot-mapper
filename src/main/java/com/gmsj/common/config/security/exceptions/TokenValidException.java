package com.gmsj.common.config.security.exceptions;

public class TokenValidException extends RuntimeException {

    public static TokenValidException tokenValidException() {
        return new TokenValidException();
    }
}
