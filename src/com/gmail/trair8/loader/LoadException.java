package com.gmail.trair8.loader;

public class LoadException extends Exception {
    public LoadException(String message, Exception e){
        super(message, e);
    }
}
