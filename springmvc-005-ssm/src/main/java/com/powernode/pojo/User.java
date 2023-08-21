package com.powernode.pojo;

public class User {
    private String UserId;
    private String cardType;
    private String cardNo;
    private String userName;
    private String userAge;
    private String userSex;
    private String userRole;

    @Override
    public String toString() {
        return "User{" +
                "UserId='" + UserId + '\'' +
                ", cardType='" + cardType + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public User(String userId, String cardType, String cardNo, String userName, String userAge, String userSex, String userRole) {
        UserId = userId;
        this.cardType = cardType;
        this.cardNo = cardNo;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
        this.userRole = userRole;
    }

    public User() {
    }
}
