package com.liuchaoya.service.impl;

import com.liuchaoya.common.bean.ResponseBean;
import com.liuchaoya.common.type.ResultCode;
import com.liuchaoya.common.utils.HttpResult;
import com.liuchaoya.common.utils.UuidUtil;
import com.liuchaoya.dao.UserMapper;
import com.liuchaoya.pojo.User;
import com.liuchaoya.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by LiuChaoya on 2018/8/2 0002 15:48.
 * email  1090969255@qq.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public ResponseBean login(User user) {
        Object resultUser = userMapper.login(user);
        return HttpResult.result(ResultCode.SUCCESS,resultUser);
    }

    @Override
    public ResponseBean insertUser(User user) {
        user.setId(UuidUtil.get32UUID());
        if (user.getUsername() == null
                ||user.getPassword() == null){
            return HttpResult.result(ResultCode.FAILURE,"用户名或密码缺失");
        }
        userMapper.insertSelective(user);
        return HttpResult.result(ResultCode.SUCCESS);
    }
}
