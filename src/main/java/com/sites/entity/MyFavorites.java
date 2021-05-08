package com.sites.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(autoResultMap = true, value = "favorites_list")
public class MyFavorites {
    /**
     * 收藏者id
     */
    private String userId;

    /**
     * 收藏的站点的id列表
     */
    @TableField(typeHandler = FastjsonTypeHandler.class)
    private List<String> siteIdList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getSiteIdList() {
        return siteIdList;
    }

    public void setSiteIdList(List<String> siteIdList) {
        this.siteIdList = siteIdList;
    }
}
