package com.rshairy.lldQuestions.Splitwise.controller;

import com.rshairy.lldQuestions.Splitwise.user.Group;
import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groupList;

    public GroupController() {
        this.groupList = new ArrayList<>();
    }

    public void createGroup(String groupId, String groupName, User createdByUser) {
        Group group = new Group();
        group.setGroupId(groupId);
        group.setName(groupName);

        // add create by user as first member
        group.addMember(createdByUser);

        groupList.add(group);
    }

    // get group by grouid
    public Group geGroupById(String id) {
        for (Group group : groupList) {
            if (group.getGroupId().equals(id)) {
                return group;
            }
        }
        return null;
    }
}
