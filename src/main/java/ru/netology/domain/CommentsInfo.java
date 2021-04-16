package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private String userId;
    private String comment;
    private int answersCount;
    private String answerComments;
    private String dateOfComment;
    private boolean commentLikeOn;
    private String commentComplain;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getAnswersCount() {
        return answersCount;
    }

    public void setAnswersCount(int answersCount) {
        this.answersCount = answersCount;
    }

    public String getAnswerComments() {
        return answerComments;
    }

    public void setAnswerComments(String answerComments) {
        this.answerComments = answerComments;
    }

    public String getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(String dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public boolean isCommentLikeOn() {
        return commentLikeOn;
    }

    public void setCommentLikeOn(boolean commentLikeOn) {
        this.commentLikeOn = commentLikeOn;
    }

    public String getCommentComplain() {
        return commentComplain;
    }

    public void setCommentComplain(String commentComplain) {
        this.commentComplain = commentComplain;
    }
}
