package com.project.messengerprojectfinal.Model;

public class Users {
    String profilePic, userName, email, passWord, userId, lastMessage, status;

    public Users() {
    }

    public Users(String profilePic, String userName, String email, String passWord, String userId, String lastMessage, String status) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.status = status;
    }

    //Contructor for Sign-up
    public Users(String userName, String email, String passWord, String status) {
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.status = status;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
