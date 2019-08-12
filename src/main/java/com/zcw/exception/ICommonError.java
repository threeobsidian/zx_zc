package com.zcw.exception;

public interface ICommonError {
   public int getOperationCode();
   public void setOperationMsg(String errMsg);
   public String getOperationMsg();
}
