package class6.placeorder.repositories;

import class6.placeorder.models.DietaryRequirement;
import class6.placeorder.models.MenuItem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryMenuItemRepositoryImpl implements MenuItemRepository {

    private Map<Long, MenuItem> menuItems;
    private static long idCounter = 0;

    public InMemoryMenuItemRepositoryImpl() {
        menuItems = new HashMap<>();
    }

    @Override
    public MenuItem add(MenuItem menuItem) {
        if(menuItem.getId() == 0){
            menuItem.setId(++idCounter);
        }
        menuItems.put(menuItem.getId(), menuItem);
        return menuItem;
    }

    @Override
    public Optional<MenuItem> findById(long id) {
        return menuItems.values().stream().filter(menuItem -> menuItem.getId() == id).findFirst();
    }
}
