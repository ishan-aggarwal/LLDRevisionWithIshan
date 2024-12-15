package class6.getmenuitems.services;

import class6.getmenuitems.models.*;
import class6.getmenuitems.repositories.MenuRepository;

import java.util.List;

public class MenuServiceImpl implements MenuService{

    private MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<MenuItem> getMenuItems(String itemType) {
        if(itemType == null){
            return menuRepository.getAll();
        } else{
            return menuRepository.getByDietaryRequirement(DietaryRequirement.valueOf(itemType));
        }
    }
}
