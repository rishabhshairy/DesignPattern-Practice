package com.rshairy.lldQuestions.Splitwise.controller;

import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
    }

    // addUser
    public void addUser(User user) {
        userList.add(user);
    }

    public User getUser(String userId) {
        for (User user : userList) {
            if (userId.equals(user.getUserId())) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return this.userList;
    }

}
