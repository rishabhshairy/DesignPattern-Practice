package com.rshairy.lldQuestions.InventoryOrderManagement.user;

import java.util.List;

public class UserController {
    List<User> users;

    public UserController(List<User> users) {
        this.users = users;
    }

    //add user
    public void addUser(User user){
        users.add(user);
    }

    //remove user
    public void removeUser(User user){
        users.remove(user);
    }

    //get particular user
    public User getUser(int userId){
        for(User user : users){
            if(user.id == userId){
                return user;
            }
        }
        return null;
    }

}
