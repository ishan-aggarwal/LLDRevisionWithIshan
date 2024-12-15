package class6.getmenuitems.services;

import class6.getmenuitems.models.MenuItem;

import java.util.List;

public interface MenuService {

    List<MenuItem> getMenuItems(String itemType);
}
