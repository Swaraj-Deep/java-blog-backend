package com.blogbackend.exceptions;

public class InvalidObjectException extends RuntimeException {
    public InvalidObjectException(String message) {
        super(message);
    }
}
