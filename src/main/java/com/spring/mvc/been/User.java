package com.spring.mvc.been;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
public class User {

    /**
     * id : 0
     * userName : zls
     * userAge : 18
     */

    private int id;
    private String userName;
    private int userAge;

    public User() {
    }

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public User(int id, String userName, int userAge) {
        this.id = id;
        this.userName = userName;
        this.userAge = userAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
