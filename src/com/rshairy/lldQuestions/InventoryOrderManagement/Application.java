package com.rshairy.lldQuestions.InventoryOrderManagement;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.*;
import com.rshairy.lldQuestions.InventoryOrderManagement.orderModel.Order;
import com.rshairy.lldQuestions.InventoryOrderManagement.strategy.NearestSelectionStrategy;
import com.rshairy.lldQuestions.InventoryOrderManagement.user.User;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Application obj = new Application();

        // create warehouse
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(obj.addWarehouseAndItsInventory());
        
        // create users in system
        List<User> userList = new ArrayList<>();
        userList.add(obj.createUser());

        // Initialize system with info
        ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(userList, warehouseList);

        obj.deliverProduct(productDeliverySystem,1);
    }

    private void deliverProduct(ProductDeliverySystem productDeliverySystem, int userId) {
        //1. Get the user object
        User user = productDeliverySystem.getUser(userId);

        //2. get warehouse based on user preference
        Warehouse warehouse = productDeliverySystem.getWarehouse(new NearestSelectionStrategy());

        //3. get all the inventory to show the user
        Inventory inventory = productDeliverySystem.getInventory(warehouse);

        ProductCategory productCategoryIWantToOrder = null;
        for(ProductCategory productCategory : inventory.getProductCategories()){

            if(productCategory.getCategoryName().equals("Pepsi 2 Litre Cold Drink")){
                productCategoryIWantToOrder = productCategory;
            }
        }


        //4. add product to the cart
        productDeliverySystem.addProductToCart(user, productCategoryIWantToOrder, 2);


        //4. place order
        Order order = productDeliverySystem.placeOrder(user, warehouse);


        //5. checkout
        productDeliverySystem.checkout(order);

    }

    private User createUser() {
        User user = new User();
        user.setId(1);
        user.setName("Rishabh");
        user.setAddress(new Address(230011, "city", "state"));
        return user;

    }

    private Warehouse addWarehouseAndItsInventory() {
        Warehouse warehouse = new Warehouse();
        Inventory inventory = new Inventory();

        inventory.addProductCategory(0001,"Pepsi 2 Litre Cold Drink",100);
        inventory.addProductCategory(0003,"Tata Tea 500gm",50);

        // create products

        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Peepsii";

        Product product2 = new Product();
        product1.id = 2;
        product1.name = "Peepsii";

        Product product3 = new Product();
        product1.id = 3;
        product1.name = "Tata tea";

        inventory.addProduct(product1,0001);
        inventory.addProduct(product2,0001);
        inventory.addProduct(product3,0003);

        warehouse.inventory = inventory;
        return warehouse;

    }
}
