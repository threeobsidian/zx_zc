package com.zcw.dto;

import com.zcw.enums.EmCommonOperationState;

import java.util.List;

public class CommonReturnExecution<T> {
    //状态码
    private int state ;
    //状态信息
    private String stateInfo;
    //数量
    private int count;
    private T data;
    private List<T> dataList;

    public CommonReturnExecution() {
    }
    //操作成功时构造
    public CommonReturnExecution(EmCommonOperationState OperationState, T data) {
        this.state = OperationState.getState();
        this.data = data;
    }
    //操作成功时构造
    public CommonReturnExecution(EmCommonOperationState OperationState, List<T> dataList) {
        this.state = OperationState.getState();
        this.dataList = dataList;
    }
    //操作失败时构造
    public CommonReturnExecution(EmCommonOperationState OperationState, String stateInfo) {
        this.state = OperationState.getState();
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
