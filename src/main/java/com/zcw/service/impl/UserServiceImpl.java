package com.zcw.service.impl;

import com.zcw.dao.UserMapper;
import com.zcw.dto.CommonReturnExecution;
import com.zcw.entity.User;
import com.zcw.enums.EmCommonOperationState;
import com.zcw.exception.UserOperationException;
import com.zcw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;
    @Override
    public CommonReturnExecution<User> addUser(User user) throws UserOperationException {
        CommonReturnExecution ce = new CommonReturnExecution();
        if (user!=null){

            int effectNum = userMapper.insert(user);
            if (effectNum >0){
                ce.setCount(effectNum);
                ce.setState(EmCommonOperationState.SUCCESS.getState());
            }else {
                ce.setCount(effectNum);
                ce.setState(EmCommonOperationState.USER_OPERATION_FAIL.getState());
                ce.setStateInfo(EmCommonOperationState.USER_OPERATION_FAIL.getStateInfo());
            }
        }else {
            throw new UserOperationException(EmCommonOperationState.PARAMETER_VALIDATION_ERROR,"User参数为空");
        }
        return ce;
    }



    @Override
    public CommonReturnExecution getUserByLoginacct(String loginacct) throws UserOperationException {
        User tempUser = new User();
        CommonReturnExecution<User> ce = new CommonReturnExecution<>();
        if (loginacct == null){
            return ce;
        }else {
            tempUser = userMapper.selectByLoginacct(loginacct);
            if (tempUser!=null&&tempUser.getUsername() != null){
                ce.setCount(1);
            }
        }
        return ce;
    }
}
