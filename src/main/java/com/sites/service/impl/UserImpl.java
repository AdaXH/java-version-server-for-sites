package com.sites.service.impl;

import com.sites.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface UserImpl {
    User queryUserInfo(String userId);
    List queryMySites(String userId);
}
