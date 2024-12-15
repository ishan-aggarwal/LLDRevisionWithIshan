package class8.inventorymanagement.services;

import class8.inventorymanagement.exceptions.ProductNotFoundException;
import class8.inventorymanagement.exceptions.UnAuthorizedAccessException;
import class8.inventorymanagement.exceptions.UserNotFoundException;
import class8.inventorymanagement.models.Inventory;

public interface InventoryService {
    public Inventory createOrUpdateInventory(int userId, int productId, int quantity) throws ProductNotFoundException, UserNotFoundException, UnAuthorizedAccessException;
    public void deleteInventory(int userId, int productId) throws UserNotFoundException, UnAuthorizedAccessException;
}
