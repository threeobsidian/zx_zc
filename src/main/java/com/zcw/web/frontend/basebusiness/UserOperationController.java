package com.zcw.web.frontend.basebusiness;

import com.zcw.dto.CommonReturnExecution;
import com.zcw.entity.User;
import com.zcw.enums.EmCommonOperationState;
import com.zcw.exception.UserOperationException;
import com.zcw.service.UserService;
import com.zcw.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Controller
@RequestMapping(value = "/user")
public class UserOperationController {
    @Autowired
    private UserService userService;
    //注册
    @RequestMapping(value = "/regoperation",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> addUser(@RequestParam(name = "loginacct") String loginacct,
                                      @RequestParam(name = "userpswd") String userpswd,
                                      @RequestParam(name = "email") String email) throws UserOperationException {
        Map<String, Object> modelMap = new HashMap<>();
        if (loginacct != null&&userpswd!=null&&email!= null){
            //先获取参数再进行数据库操作
            User user = convertFormString(loginacct,userpswd,email);
            CommonReturnExecution ce = userService.addUser(user);
            if (ce.getState()== EmCommonOperationState.SUCCESS.getState()){
                modelMap.put("success",true);
            }else {
                modelMap.put("success",false);
            }
        }else {
            throw  new UserOperationException(EmCommonOperationState.PARAMETER_VALIDATION_ERROR);
        }
        return modelMap;
    }
    @RequestMapping(value = "/checkuserexist",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> checkUserExist(@RequestParam(name = "loginacct") String loginacct) throws UserOperationException {
        Map<String,Object> modelMap = new HashMap<>();
        if (!loginacct.equals("")){

            CommonReturnExecution ex = userService.getUserByLoginacct(loginacct);
            if (ex.getCount()>0){
                modelMap.put("success",true);
                modelMap.put("msg","账号已存在");
            }else {
                modelMap.put("success",true);
            }
        }
        return modelMap;
    }
    /**
     * 将参数组装成User类
     * @param loginacct
     * @param userpswd
     * @param email
     * @return
     */
    private User convertFormString(String loginacct,String userpswd,String email){
        User user = new User();
        user.setUsername("用户"+ ThreadLocalRandom.current().nextInt(100000,999999));
        user.setLoginacct(loginacct);
        user.setUserpswd(userpswd);
        user.setEmail(email);
        user.setCreatetime(DateUtil.createCurrentTimeToString("yyyy-MM-dd"));
        return user;
    }
}
