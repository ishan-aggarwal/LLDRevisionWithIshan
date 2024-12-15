package class6.addmenuitems.services;

import class6.addmenuitems.exceptions.UnAuthorizedAccess;
import class6.addmenuitems.exceptions.UserNotFoundException;
import class6.addmenuitems.models.MenuItem;

import java.util.List;

public interface MenuService {
    MenuItem addMenuItem(long userId, String name, double price, String dietaryRequirement, String itemType, String description) throws UserNotFoundException, UnAuthorizedAccess;

}
