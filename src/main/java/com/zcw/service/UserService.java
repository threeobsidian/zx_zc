package com.zcw.service;

import com.zcw.dto.CommonReturnExecution;
import com.zcw.entity.User;
import com.zcw.exception.UserOperationException;

public interface UserService {
    //添加用户
    CommonReturnExecution addUser(User user) throws UserOperationException;
    CommonReturnExecution getUserByLoginacct(String loginacct) throws UserOperationException;
}
