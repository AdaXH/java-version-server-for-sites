package com.sites.entity.model.site;

import com.baomidou.mybatisplus.annotation.*;
import com.sites.entity.User;

import java.util.Date;

/**
 * 站点基础模型
 * @author Ada
 */

public class BaseSite {
    /**
     * 唯一id
     */
    @TableId(type = IdType.ID_WORKER_STR)
    private String siteId;

    /**
     * 站长id
     */
    private String masterId;
    /**
     * 战点图标
     */
    private String siteIcon;
    /**
     * 站点名称
     */
    private String siteName;
    /**
     * 审核状态
     */
    @EnumValue
    private SiteStatusEnum siteVerify;

    /**
     * 站长信息
     */
    @TableField(exist = false)
    private User master;

    @Version
    private Integer version;

    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @TableField(fill = FieldFill.UPDATE)
    private Date gmtModified;

    public User getMaster() {
        return master;
    }

    public void setMaster(User master) {
        this.master = master;
    }

    public String getSiteId() {
        return siteId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
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

    public String getSiteIcon() {
        return siteIcon;
    }

    public void setSiteIcon(String siteIcon) {
        this.siteIcon = siteIcon;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public SiteStatusEnum getSiteVerify() {
        return siteVerify;
    }

    public void setSiteVerify(SiteStatusEnum siteVerify) {
        this.siteVerify = siteVerify;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }
}
