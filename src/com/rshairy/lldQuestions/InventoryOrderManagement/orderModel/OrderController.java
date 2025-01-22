package com.rshairy.lldQuestions.InventoryOrderManagement.orderModel;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Warehouse;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.User;

import java.util.*;

public class OrderController {
    List<Order> orderList;
    Map<Integer, List<Order>> userIDVsOrders;

    public OrderController() {
        this.orderList = new LinkedList<>();
        this.userIDVsOrders = new LinkedHashMap<>();
    }

    //create New Order
    public Order createNewOrder(User user, Warehouse warehouse){
        Order order = new Order(user, warehouse);
        orderList.add(order);

        if(userIDVsOrders.containsKey(user.getId())){
            List<Order> userOrders = userIDVsOrders.get(user.getId());
            userOrders.add(order);
            userIDVsOrders.put(user.getId(), userOrders);
        } else {
            List<Order> userOrders = new ArrayList<>();
            userOrders.add(order);
            userIDVsOrders.put(user.getId(), userOrders);

        }
        return order;
    }


    //remove order
    public void removeOrder(Order order){

        //remove order capability goes here
    }

    public List<Order> getOrderByCustomerId(int userId){
        return null;
    }

    public Order getOrderByOrderId(int orderId){
        return null;
    }

}
