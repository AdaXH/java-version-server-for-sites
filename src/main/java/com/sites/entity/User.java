package com.sites.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.sites.entity.model.usermodel.Setting;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 用户模型
 * @author Ada
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(autoResultMap = true)

public class User {
    /**
     * 用户唯一id
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String userId;
    /**
     * 用户名
     */
    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.UPDATE)
    private Date gmtModified;

    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 是否是管理员
     */
    private boolean admin;
    /**
     * 性别，0: 女，1：男，2：小猫咪
     */
    private Integer gender;
    /**
     * 个人简介
     */
    private String myDesc;
    /**
     * qq登录用户uId
     */
    private String unionid;
    /**
     * qq登录的用户唯一标识
     */
    private String qqUserId;

    /**
     * 用户设置
     */
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private Setting setting;
    /**
     * 是否是超级管理员
     */
    private boolean superAdmin;

    /**
     * 用户的站点
     */
    @TableField(exist = false, typeHandler = FastjsonTypeHandler.class)
    private List<Site> mySites = new ArrayList<>();

    @Version
    private Integer version;

    public String getUserId() {
        return userId;
    }

    public List getMySites() {
        return mySites;
    }

    public void setMySites(List mySites) {
        this.mySites = mySites;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMyDesc() {
        return myDesc;
    }

    public void setMyDesc(String myDesc) {
        this.myDesc = myDesc;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getQqUserId() {
        return qqUserId;
    }

    public void setQqUserId(String qqUserId) {
        this.qqUserId = qqUserId;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }

    public boolean isSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(boolean superAdmin) {
        this.superAdmin = superAdmin;
    }


    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
