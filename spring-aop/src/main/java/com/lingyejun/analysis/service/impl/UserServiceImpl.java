package com.lingyejun.analysis.service.impl;

import com.lingyejun.analysis.domain.UserDto;
import com.lingyejun.analysis.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author: lingyejun
 * @Date: 2020/2/5
 * @Describe:
 * @Modified By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto getUser() {
        UserDto user = new UserDto();
        user.setName("翎野君");
        user.setDesc("Spring AOP 源码解析");
        return user;
    }
}
