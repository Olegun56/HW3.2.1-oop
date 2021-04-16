package ru.netology.domain;

public class LikesInfo {
    private int count;
    private String userId;
    private boolean pushOn;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isPushOn() {
        return pushOn;
    }

    public void setPushOn(boolean pushOn) {
        this.pushOn = pushOn;
    }

}
