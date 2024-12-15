package class6.placeorder.repositories;

import class6.placeorder.models.MenuItem;

import java.util.Optional;

public interface MenuItemRepository {

    MenuItem add(MenuItem menuItem);

    Optional<MenuItem> findById(long id);
}
