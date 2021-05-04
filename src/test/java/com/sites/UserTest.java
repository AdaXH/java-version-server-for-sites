package com.sites;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sites.entity.Site;
import com.sites.entity.model.usermodel.AccessNotification;
import com.sites.entity.model.usermodel.Setting;
import com.sites.mapper.UserMapper;
import com.sites.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void loginTest() {
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
        objectQueryWrapper.eq("name", "Ada").eq("password", "11");
        User user = userMapper.selectOne(objectQueryWrapper);
        System.out.println(user);
    }

    @Test
    void queryList() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("name", "Ada");
        List<User> users = userMapper.selectList(wrapper);
        users.forEach(System.out::print);
    }

    @Test
    void queryByHash() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Ada");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::print);
    }

    @Test
    void newUser() {
        Setting mySetting = new Setting();
        AccessNotification accessNotification = new AccessNotification();
        accessNotification.setCollection(false);
        accessNotification.setMessage(true);
        accessNotification.setUpvote(false);
        mySetting.setAcessNotification(accessNotification);
        User user1 = new User();
        user1.setSetting(mySetting);
        user1.setName("Ada");
        user1.setPassword("1");
        int insert = userMapper.insert(user1);
        System.out.println(insert);
    }

    @Test
    void updUser() {
        User user = userMapper.selectById("1388780233398550529");
        List<Site> myLifeSites = new ArrayList<>();
        user.setEmail("ada@qq.com");
        userMapper.updateById(user);
    }

    @Test
    void queryById(){
        User user = userMapper.queryUserInfo("1388780233398550529");
        System.out.println(user);
    }

    @Test void queryMySites() {
        System.out.println(userMapper.queryMySites("1388780233398550529"));
    }
}
