package com.zcw.service.impl;

import com.zcw.dto.CommonReturnExecution;
import com.zcw.entity.User;
import com.zcw.exception.UserOperationException;
import com.zcw.service.BaseTest;
import com.zcw.service.UserService;
import com.zcw.util.DateUtil;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest extends BaseTest {
    @Autowired
    private UserService userService;
    @Test
    public void TestAAddUser() throws UserOperationException {
        User user = new User();
        user.setCreatetime(DateUtil.createCurrentTimeToString("yyyy-MM-dd"));
        user.setEmail("54321@cc.com");
        user.setLoginacct("accc");
        user.setUsername("小李");
        user.setUserpswd("123456");
        CommonReturnExecution commonReturnExecution = userService.addUser(user);
        assertEquals(1,commonReturnExecution.getCount());
    }
}
