package com.sites.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.sites.entity.model.site.BaseSite;
import com.sites.entity.model.site.MessageVOList;
import com.sites.entity.model.usermodel.SiteTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(autoResultMap = true)

/**
 * 站点模型
 * @author Ada
 */
public class Site extends BaseSite {
    private SiteTypeEnum siteType;

    private String messageVoListId;

    @TableField(exist = false, typeHandler = FastjsonTypeHandler.class)
    private MessageVOList messageVOList;

    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    public String getMessageVoListId() {
        return messageVoListId;
    }

    public void setMessageVoListId(String messageVoListId) {
        this.messageVoListId = messageVoListId;
    }

    public MessageVOList getMessageVOList() {
        return messageVOList;
    }

    public void setMessageVOList(MessageVOList messageVOList) {
        this.messageVOList = messageVOList;
    }
}
