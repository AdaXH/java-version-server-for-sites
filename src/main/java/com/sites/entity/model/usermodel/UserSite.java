package com.sites.entity.model.usermodel;

import com.baomidou.mybatisplus.annotation.EnumValue;

public class UserSite {

  @EnumValue
 private SiteTypeEnum siteType;
 private String siteId;

    public SiteTypeEnum getSiteType() {
        return siteType;
    }

    public void setSiteType(SiteTypeEnum siteType) {
        this.siteType = siteType;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
