package com.cricketscoringsystem.cricketscoringsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException1.class)
    public ResponseEntity<ErrorResponse> handleCustomException1(CustomException1 ex) {
        ErrorResponse errorResponse = new ErrorResponse("CUSTOM_EXCEPTION_1", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }

    @ExceptionHandler(CustomException2.class)
    public ResponseEntity<ErrorResponse> handleCustomException2(CustomException2 ex) {
        ErrorResponse errorResponse = new ErrorResponse("CUSTOM_EXCEPTION_2", ex.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse);
    }
}

