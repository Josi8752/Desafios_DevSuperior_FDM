package com.desafioCRUD.CRUD.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException{
    public  ResourceNotFoundException(String msg){
        super(msg);
    }
}
