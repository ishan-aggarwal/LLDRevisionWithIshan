package class6.addmenuitems.controllers;

import class6.addmenuitems.dtos.*;
import class6.addmenuitems.models.MenuItem;
import class6.addmenuitems.services.MenuService;

import java.util.List;

public class MenuController {

    private MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    public AddMenuItemResponseDto addMenuItem(AddMenuItemRequestDto requestDto){
        AddMenuItemResponseDto responseDto = new AddMenuItemResponseDto();
        try {
            MenuItem menuItem = menuService.addMenuItem(requestDto.getUserId(), requestDto.getName(), requestDto.getPrice(), requestDto.getDietaryRequirement(), requestDto.getItemType(), requestDto.getDescription());
            responseDto.setMenuItem(menuItem);
            responseDto.setStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
