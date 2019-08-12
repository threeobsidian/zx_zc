package com.zcw.exception;

public class UserOperationException extends Exception implements ICommonError {
    private  ICommonError iCommonError;

    public UserOperationException(ICommonError iCommonError) {
        super();
        this.iCommonError = iCommonError;
    }
    public UserOperationException(ICommonError iCommonError,String msg) {
        super();
        this.iCommonError = iCommonError;
        this.iCommonError.setOperationMsg(msg);
    }


    @Override
    public int getOperationCode() {
        return this.iCommonError.getOperationCode();
    }

    @Override
    public void setOperationMsg(String errMsg) {
        this.iCommonError.setOperationMsg(errMsg);
    }

    @Override
    public String getOperationMsg() {
        return this.iCommonError.getOperationMsg();
    }
}
