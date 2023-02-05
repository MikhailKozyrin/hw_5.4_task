package org.example.exceprions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
