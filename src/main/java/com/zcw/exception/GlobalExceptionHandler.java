package com.zcw.exception;

import com.zcw.enums.EmCommonOperationState;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常捕获及处理
 */
@ControllerAdvice(basePackages = "com.zcw.web")
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> exception(Exception ex ){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",false);
        //捕获user操作的异常
        if (ex instanceof UserOperationException){
            UserOperationException  userOperationException = (UserOperationException) ex;

            modelMap.put("errCode", userOperationException.getOperationCode());
            modelMap.put("errMsg", userOperationException.getOperationMsg());
        }else {
            modelMap.put("errCode", EmCommonOperationState.UNKNOWN_ERROR.getOperationCode());
            modelMap.put("errMsg", EmCommonOperationState.UNKNOWN_ERROR.getOperationMsg());
        }
        return modelMap;
    }
}
