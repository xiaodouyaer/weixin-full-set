package com.liuchaoya.service;

import com.liuchaoya.common.bean.ResponseBean;
import com.liuchaoya.pojo.User;

/**
 * Created by LiuChaoya on 2018/8/2 0002 15:46.
 * email  1090969255@qq.com
 */

public interface UserService {
    ResponseBean login(User user);

    ResponseBean insertUser(User user);
}
