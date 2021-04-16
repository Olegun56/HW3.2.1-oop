package ru.netology.domain;

public class Post {
    private String postId;
    private String imageUrl;
    private String info;
    private String commentsImage;
    private String likesImage;
    private String viewsImage;
    private String repostsImage;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCommentsImage() {
        return commentsImage;
    }

    public void setCommentsImage(String commentsImage) {
        this.commentsImage = commentsImage;
    }

    public String getLikesImage() {
        return likesImage;
    }

    public void setLikesImage(String likesImage) {
        this.likesImage = likesImage;
    }

    public String getViewsImage() {
        return viewsImage;
    }

    public void setViewsImage(String viewsImage) {
        this.viewsImage = viewsImage;
    }

    public String getRepostsImage() {
        return repostsImage;
    }

    public void setRepostsImage(String repostsImage) {
        this.repostsImage = repostsImage;
    }
}
