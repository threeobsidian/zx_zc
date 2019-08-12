package com.zcw.enums;

import com.zcw.exception.ICommonError;

/**
 * 操作状态信息枚举类
 */
public enum EmCommonOperationState implements ICommonError {
    //10001表示操作成功
    SUCCESS(10001,"操作成功"),
    //2000开头为系统通用错误
    PARAMETER_VALIDATION_ERROR(20001,"参数不合法"),
    UNKNOWN_ERROR(20002,"未知错误"),
    //3000开头为用户信息相关错误定义
    USER_NOT_EXIT(30001,"用户不存在"),

    USER_OPERATION_FAIL(30002,"用户相关操作失败"),
    USER_ALREADY_EXISTS(30003,"用户已存在")
    //后面可以自定义错误如4000开头为项目相关，40001表示项目不存在
    ;
    private int state ;
    private String stateInfo;

    EmCommonOperationState(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }


    @Override
    public int getOperationCode() {
        return 0;
    }

    @Override
    public void setOperationMsg(String errMsg) {

    }

    @Override
    public String getOperationMsg() {
        return null;
    }
}
