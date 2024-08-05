package com.Test.demo.exceptions;

public class IDNotFound extends RuntimeException{

    private static final long serialVersionUID=1L;

    public String errMsg;

    public String getErrMsg(){
        return errMsg;
    }
    public void setErrMsg(String ErrMsg){
        this.errMsg= ErrMsg;
    }

    public IDNotFound(String errmsg){
        this.errMsg= errmsg;
    }

}
