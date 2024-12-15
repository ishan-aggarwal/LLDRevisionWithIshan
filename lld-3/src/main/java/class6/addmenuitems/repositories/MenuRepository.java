package class6.addmenuitems.repositories;

import class6.addmenuitems.models.DietaryRequirement;
import class6.addmenuitems.models.MenuItem;

import java.util.List;

public interface MenuRepository {

    MenuItem add(MenuItem menuItem);
    List<MenuItem> getAll();

    List<MenuItem> getByDietaryRequirement(DietaryRequirement dietaryRequirement);
}
