package com.sites.controller.user;

import com.sites.entity.User;
import com.sites.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable String id) {
        return userService.queryUserInfo(id);
    }

    @GetMapping("/my-sites/{id}")
    @ResponseBody
    public List queryMySites(@PathVariable String id) {
        return userService.queryMySites(id);
    }
}
