package com.duberlyguarnizo.gossipbackend.exceptions;

public class NonExistentEntityException  extends RuntimeException{
    public NonExistentEntityException(String message) {
        super(message);
    }
}
