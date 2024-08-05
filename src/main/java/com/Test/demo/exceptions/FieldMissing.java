package com.Test.demo.exceptions;

public class FieldMissing extends RuntimeException{

    private static final long serialVersionUID=2L;

    public String errMsg1;

    public FieldMissing(String errMsg) {
        this.errMsg1 = errMsg;
    }

    public String getErrMsg1() {
        return errMsg1;
    }

    public void setErrMsg1(String errMsg1) {
        this.errMsg1 = errMsg1;
    }
}
