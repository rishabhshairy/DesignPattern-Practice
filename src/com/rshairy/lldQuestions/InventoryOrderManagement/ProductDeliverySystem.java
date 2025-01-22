package com.rshairy.lldQuestions.InventoryOrderManagement;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Inventory;
import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.ProductCategory;
import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Warehouse;
import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.WarehouseController;
import com.rshairy.lldQuestions.InventoryOrderManagement.orderModel.Order;
import com.rshairy.lldQuestions.InventoryOrderManagement.orderModel.OrderController;
import com.rshairy.lldQuestions.InventoryOrderManagement.strategy.NearestSelectionStrategy;
import com.rshairy.lldQuestions.InventoryOrderManagement.strategy.WarehouseSelectionStrategy;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.Cart;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.User;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.UserController;

import java.util.List;

public class ProductDeliverySystem {
    UserController userController;
    WarehouseController warehouseController;
    OrderController orderController;

    ProductDeliverySystem(List<User> userList, List<Warehouse> warehouseList){
        userController = new UserController(userList);
        warehouseController = new WarehouseController(warehouseList , new NearestSelectionStrategy());
        orderController = new OrderController();
    }

    //get user object
    public User getUser(int userId){
        return userController.getUser(userId);
    }

    //get warehouse
    public Warehouse getWarehouse(WarehouseSelectionStrategy warehouseSelectionStrategy){
        return warehouseController.selectWarehouse(warehouseSelectionStrategy);

    }

    //get inventory
    public Inventory getInventory(Warehouse warehouse){
        return warehouse.inventory;

    }

    //add product to cart
    public void addProductToCart(User user, ProductCategory product, int count){
        Cart cart = user.getCart();
        cart.addItem(product.getCategoryId(), count);
    }

    //place order
    public Order placeOrder(User user, Warehouse warehouse){
        return orderController.createNewOrder(user, warehouse);
    }

    public void checkout(Order order){
        order.checkout();
    }

}
