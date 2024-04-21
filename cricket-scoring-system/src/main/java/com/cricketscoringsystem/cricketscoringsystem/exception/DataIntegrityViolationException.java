package com.cricketscoringsystem.cricketscoringsystem.exception;

public class DataIntegrityViolationException extends DatabaseException{

    public DataIntegrityViolationException(String message) {
        super(message);
    }

}
