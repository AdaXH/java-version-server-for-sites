package com.sites.controller.user;

import com.sites.common.BizException;
import com.sites.common.CommonResponse;
import com.sites.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public CommonResponse queryUserById(@PathVariable String id) {
        if (id == null) {
            throw new BizException("用户id不能为空", "-1");
        }
        return CommonResponse.success(userService.queryUserInfo(id));
    }

    @GetMapping("/my-sites/{id}")
    public CommonResponse queryMySites(@PathVariable String id) {
        if (id == null) {
            throw new BizException("用户id不能为空", "-1");
        }
        return CommonResponse.success(userService.queryMySites(id));
    }
}
