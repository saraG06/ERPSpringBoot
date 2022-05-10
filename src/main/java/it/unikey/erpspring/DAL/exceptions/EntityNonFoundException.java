package it.unikey.erpspring.DAL.exceptions;

public class EntityNonFoundException extends Exception{

    public EntityNonFoundException(String message) {
        super(message);
    }
}
