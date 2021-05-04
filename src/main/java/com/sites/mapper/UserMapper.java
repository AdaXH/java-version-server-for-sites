package com.sites.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sites.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {
    User queryUserInfo(String userId);
    List queryMySites(String userId);
}
