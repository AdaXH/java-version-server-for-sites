package com.sites.entity.model.usermodel;

/**
 * 通知设置
 * @author Ada
 */
public class AccessNotification {
    /**
     * 点赞通知
     */
    private boolean upvote;
    /**
     * 收藏通知
     */
    private boolean collection;
    /**
     * 留言通知
     */
    private boolean message;

    public boolean isUpvote() {
        return upvote;
    }

    public void setUpvote(boolean upvote) {
        this.upvote = upvote;
    }

    public boolean isCollection() {
        return collection;
    }

    public void setCollection(boolean collection) {
        this.collection = collection;
    }

    public boolean isMessage() {
        return message;
    }

    public void setMessage(boolean message) {
        this.message = message;
    }
}
