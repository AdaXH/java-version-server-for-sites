package com.sites.entity.model.site;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.sites.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(autoResultMap = true, value = "site_message_vo")
public class MessageVO {
    @TableId(type = IdType.ID_WORKER_STR)
    private String messageVoId;
    private String messageVoListId;
    private String messageContent;
    private String fromUserId;
    private String toUserId;

    @TableField(fill = FieldFill.INSERT)
    private Date messageDate;

    @TableField(exist = false, typeHandler = FastjsonTypeHandler.class)
    private User toUserVO;

    @TableField(exist = false, typeHandler = FastjsonTypeHandler.class)
    private User fromUserVO;

    public Date getMessageDate() {
        return messageDate;
    }

    public String getMessageVoListId() {
        return messageVoListId;
    }

    public void setMessageVoListId(String messageVoListId) {
        this.messageVoListId = messageVoListId;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageVoId() {
        return messageVoId;
    }

    public void setMessageVoId(String messageVoId) {
        this.messageVoId = messageVoId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    public User getToUserVO() {
        return toUserVO;
    }

    public void setToUserVO(User toUserVO) {
        this.toUserVO = toUserVO;
    }

    public User getFromUserVO() {
        return fromUserVO;
    }

    public void setFromUserVO(User fromUserVO) {
        this.fromUserVO = fromUserVO;
    }
}
