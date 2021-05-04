package com.sites.entity.model.site;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(autoResultMap = true, value = "site_message_list")
public class MessageVOList {

    private String SiteId;

    @TableId(type = IdType.ID_WORKER_STR)
    private String messageVoListId;

    @TableField(exist = false, typeHandler = FastjsonTypeHandler.class)
    private List<MessageVO> messages = new ArrayList<MessageVO>();

    public String getMessageVoListId() {
        return messageVoListId;
    }

    public void setMessageVoListId(String messageVoListId) {
        this.messageVoListId = messageVoListId;
    }

    public List<MessageVO> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageVO> messages) {
        this.messages = messages;
    }

    public String getSiteId() {
        return SiteId;
    }

    public void setSiteId(String siteId) {
        SiteId = siteId;
    }
}
