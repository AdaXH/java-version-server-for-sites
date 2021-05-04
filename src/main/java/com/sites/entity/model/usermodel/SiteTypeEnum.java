package com.sites.entity.model.usermodel;

public enum SiteTypeEnum {
    life("生活类", "life");
    private String typeName;
    private String type;
    private SiteTypeEnum(String typeName, String type) {
        this.type = type;
        this.typeName = typeName;
    }
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
