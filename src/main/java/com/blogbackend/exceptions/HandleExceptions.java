package com.blogbackend.exceptions;

import com.blogbackend.objects.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.NoSuchElementException;

@ControllerAdvice
public class HandleExceptions {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<ErrorObject> handleNoSuchElementException(NoSuchElementException noSuchElementException, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ErrorObject(new Date(), 404, noSuchElementException.getMessage(), webRequest.getDescription(false)));
    }

    @ExceptionHandler(InvalidObjectException.class)
    public ResponseEntity<ErrorObject> handleInvalidObjectException(InvalidObjectException invalidObjectException, WebRequest webRequest) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorObject(new Date(), 400, invalidObjectException.getMessage(), webRequest.getDescription(false)));
    }

}
