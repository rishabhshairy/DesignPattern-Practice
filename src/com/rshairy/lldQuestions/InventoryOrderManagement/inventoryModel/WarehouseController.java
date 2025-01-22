package com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel;

import com.rshairy.lldQuestions.InventoryOrderManagement.strategy.WarehouseSelectionStrategy;

import java.util.List;

public class WarehouseController {
    List<Warehouse> warehouses;
    WarehouseSelectionStrategy selectionStrategy;

    public WarehouseController(List<Warehouse> warehouses, WarehouseSelectionStrategy selectionStrategy) {
        this.warehouses = warehouses;
        this.selectionStrategy = selectionStrategy;
    }

    //add new warehouse
    public void addNewWarehouse(Warehouse warehouse){
        warehouses.add(warehouse);
    }

    //remove warehouse
    public void removeWarehouse(Warehouse warehouse){
        warehouses.remove(warehouse);
    }

    public Warehouse selectWarehouse(WarehouseSelectionStrategy selectionStrategy){
        this.selectionStrategy = selectionStrategy;
        return selectionStrategy.selectionStrategy(warehouses);
    }

}
