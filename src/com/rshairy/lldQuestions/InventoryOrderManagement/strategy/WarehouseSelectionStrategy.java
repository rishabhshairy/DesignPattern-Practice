package com.rshairy.lldQuestions.InventoryOrderManagement.strategy;

import com.rshairy.lldQuestions.InventoryOrderManagement.inventoryModel.Warehouse;

import java.util.List;

public abstract class WarehouseSelectionStrategy {
   public abstract Warehouse selectionStrategy(List<Warehouse> warehouseList);
}
