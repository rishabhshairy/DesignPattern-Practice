package com.rshairy.lldQuestions.InventoryOrderManagement.strategy;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Warehouse;

import java.util.List;

public class NearestSelectionStrategy extends WarehouseSelectionStrategy {

    @Override
    public Warehouse selectionStrategy(List<Warehouse> warehouseList) {
        return warehouseList.get(0);
    }
}
