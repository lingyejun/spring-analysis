package com.lingyejun.analysis.controller;

import com.lingyejun.analysis.domain.UserDto;
import com.lingyejun.analysis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: lingyejun
 * @Date: 2020/2/5
 * @Describe:
 * @Modified By:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/user")
    public UserDto getUser() {
        UserDto userDto = userService.getUser();
        return userDto;
    }
}
