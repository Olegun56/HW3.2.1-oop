package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private int groupCanPost;
    private boolean canClose;
    private boolean canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}

