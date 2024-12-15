package class6.getmenuitems.repositories;

import class6.getmenuitems.models.DietaryRequirement;
import class6.getmenuitems.models.MenuItem;

import java.util.List;

public interface MenuRepository {

    MenuItem add(MenuItem menuItem);
    List<MenuItem> getAll();

    List<MenuItem> getByDietaryRequirement(DietaryRequirement dietaryRequirement);

    MenuItem save(MenuItem menuItem);
}
