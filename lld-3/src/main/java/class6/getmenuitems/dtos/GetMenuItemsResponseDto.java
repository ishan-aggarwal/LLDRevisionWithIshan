package class6.getmenuitems.dtos;

import class6.getmenuitems.models.MenuItem;

import java.util.List;

public class GetMenuItemsResponseDto {
    private List<MenuItem> menuItems;
    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
