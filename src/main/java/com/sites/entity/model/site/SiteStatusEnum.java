package com.sites.entity.model.site;

public enum SiteStatusEnum {
    VERIFIED("审核通过", 1), REJECTED("未通过审核", 2), INIT("提交初始化", 0);

    private String statusName;
    private int statusNum;

    SiteStatusEnum(String statusName, int statusNum) {
        this.statusName = statusName;
        this.statusNum = statusNum;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public int getStatusNum() {
        return statusNum;
    }

    public void setStatusNum(int statusNum) {
        this.statusNum = statusNum;
    }
}
