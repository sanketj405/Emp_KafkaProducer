package com.Test.demo.controller;


import com.Test.demo.exceptions.FieldMissing;
import com.Test.demo.exceptions.IDNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerController {

    @ExceptionHandler(IDNotFound.class)
    @ResponseStatus(code= HttpStatus.NOT_FOUND)
    public String runTimeExceptionHandler(IDNotFound ex){
        return ex.getErrMsg();
    }

    @ExceptionHandler(FieldMissing.class)
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public String missingFieldHandler(FieldMissing ex){
        return ex.getErrMsg1();
    }
}
