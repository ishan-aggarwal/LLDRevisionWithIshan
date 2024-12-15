package class6.addmenuitems.services;

import class6.addmenuitems.exceptions.UnAuthorizedAccess;
import class6.addmenuitems.exceptions.UserNotFoundException;
import class6.addmenuitems.models.*;
import class6.addmenuitems.repositories.MenuRepository;
import class6.addmenuitems.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

public class MenuServiceImpl implements MenuService{

    private MenuRepository menuRepository;
    private UserRepository userRepository;

    public MenuServiceImpl(MenuRepository menuRepository, UserRepository userRepository) {
        this.menuRepository = menuRepository;
        this.userRepository = userRepository;
    }

    @Override
    public MenuItem addMenuItem(long userId, String name, double price, String dietaryRequirement, String itemType, String description) throws UserNotFoundException, UnAuthorizedAccess {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new UserNotFoundException("User not found");
        }
        User user = userOptional.get();
        if(user.getUserType() != UserType.ADMIN){
            throw new UnAuthorizedAccess("User is not an admin");
        }
        MenuItem menuItem = new MenuItem();
        menuItem.setName(name);
        menuItem.setPrice(price);
        menuItem.setDietaryRequirement(DietaryRequirement.valueOf(dietaryRequirement));
        menuItem.setItemType(ItemType.valueOf(itemType));
        menuItem.setDescription(description);
        menuItem = menuRepository.add(menuItem);
        return menuItem;
    }

}
