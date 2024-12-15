package class8.outofstocknotification.services;

import class8.outofstocknotification.exceptions.ProductNotFoundException;
import class8.outofstocknotification.models.Inventory;

public interface InventoryService {

    public Inventory updateInventory(int productId, int quantity) throws ProductNotFoundException;
}
