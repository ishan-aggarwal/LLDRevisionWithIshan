package class8.inventorymanagement.services;

import class8.inventorymanagement.exceptions.ProductNotFoundException;
import class8.inventorymanagement.exceptions.UnAuthorizedAccessException;
import class8.inventorymanagement.exceptions.UserNotFoundException;
import class8.inventorymanagement.models.Inventory;
import class8.inventorymanagement.models.Product;
import class8.inventorymanagement.models.User;
import class8.inventorymanagement.models.UserType;
import class8.inventorymanagement.repositories.InventoryRepository;
import class8.inventorymanagement.repositories.ProductRepository;
import class8.inventorymanagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{

    private UserRepository userRepository;
    private InventoryRepository inventoryRepository;
    private ProductRepository productRepository;

    @Autowired
    public InventoryServiceImpl(UserRepository userRepository, InventoryRepository inventoryRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.inventoryRepository = inventoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Inventory createOrUpdateInventory(int userId, int productId, int quantity) throws ProductNotFoundException, UserNotFoundException, UnAuthorizedAccessException {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        if(!user.getUserType().equals(UserType.ADMIN)){
            throw new UnAuthorizedAccessException("Only admins can create or update inventory");
        }
        Optional<Inventory> inventoryOptional = inventoryRepository.findByProductId(productId);
        if(inventoryOptional.isEmpty()){
            Product product = this.productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product not found"));
            Inventory inventory = new Inventory();
            inventory.setProduct(product);
            inventory.setQuantity(quantity);
            return inventoryRepository.save(inventory);
        } else{
            Inventory inventory = inventoryOptional.get();
            inventory.setQuantity(inventory.getQuantity() + quantity);
            return inventoryRepository.save(inventory);
        }
    }

    @Override
    public void deleteInventory(int userId, int productId) throws UserNotFoundException, UnAuthorizedAccessException {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        if(!user.getUserType().equals(UserType.ADMIN)){
            throw new UnAuthorizedAccessException("Only admins can delete inventory");
        }
        Optional<Inventory> inventoryOptional = inventoryRepository.findByProductId(productId);
        if(inventoryOptional.isPresent()){
            Inventory inventory = inventoryOptional.get();
            inventoryRepository.delete(inventory);
        }
    }
}
