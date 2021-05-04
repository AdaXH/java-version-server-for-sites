package com.sites.entity.model.usermodel;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;

/**
 * 用户设置
 * @author Ada
 */
public class Setting {

    /**
     * 通知设置
     */
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private AccessNotification acessNotification;

    public AccessNotification getAcessNotification() {
        return acessNotification;
    }

    public void setAcessNotification(AccessNotification acessNotification) {
        this.acessNotification = acessNotification;
    }
}

