package com.rshairy.lldQuestions.Splitwise;

import com.rshairy.lldQuestions.Splitwise.controller.BalanceSheetController;
import com.rshairy.lldQuestions.Splitwise.controller.GroupController;
import com.rshairy.lldQuestions.Splitwise.controller.UserController;
import com.rshairy.lldQuestions.Splitwise.expense.split.Split;
import com.rshairy.lldQuestions.Splitwise.expense.split.SplitType;
import com.rshairy.lldQuestions.Splitwise.user.Group;
import com.rshairy.lldQuestions.Splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class SplitwiseApp {

    UserController userController;
    GroupController groupController;
    BalanceSheetController balanceSheetController;

    public SplitwiseApp() {
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new BalanceSheetController();
    }

    public void demo() {

        // setup users and group
        steupUserAndGroups();

        // Add members to grp
        Group group = groupController.geGroupById("GRP1001");
        group.addMember(userController.getUser("U3001"));
        group.addMember(userController.getUser("U2001"));

        // Create an expense
        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUser("U1001"), 300);
        Split split2 = new Split(userController.getUser("U2001"), 300);
        Split split3 = new Split(userController.getUser("U3001"), 300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createGroupExpense("Exp1001", "Breakfast", 900, splits,
                SplitType.EQUAL, userController.getUser("U1001"));

        List<Split> splits2 = new ArrayList<>();
        Split splits2_1 = new Split(userController.getUser("U1001"), 400);
        Split splits2_2 = new Split(userController.getUser("U2001"), 100);
        splits2.add(splits2_1);
        splits2.add(splits2_2);
        group.createGroupExpense("Exp1002", "Lunch", 500, splits2,
                SplitType.UNEQUAL, userController.getUser("U2001"));

        for (User user : userController.getAllUsers()) {
            balanceSheetController.showBalanceSheetOfUser(user);
        }

    }

    private void steupUserAndGroups() {
        addUsersToApp();
        // Create a group by user1 and user2
        User user1 = userController.getUser("U1001");
        groupController.createGroup("GRP1001", "Office Outing", user1);

    }

    private void addUsersToApp() {
        //adding User1
        User user1 = new User("U1001", "User1");

        //adding User2
        User user2 = new User("U2001", "User2");

        //adding User3
        User user3 = new User("U3001", "User3");

        User user4 = new User("U4001", "User4");

        User user5 = new User("U5001", "User5");

        User user6 = new User("U6001", "User6");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
        userController.addUser(user4);
        userController.addUser(user5);
        userController.addUser(user6);

    }
}
