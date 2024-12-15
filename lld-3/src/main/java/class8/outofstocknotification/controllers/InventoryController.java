package class8.outofstocknotification.controllers;

import class8.outofstocknotification.dtos.ResponseStatus;
import class8.outofstocknotification.dtos.UpdateInventoryRequestDto;
import class8.outofstocknotification.dtos.UpdateInventoryResponseDto;
import class8.outofstocknotification.models.Inventory;
import class8.outofstocknotification.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InventoryController {

    private InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public UpdateInventoryResponseDto updateInventory(UpdateInventoryRequestDto requestDto) {
        UpdateInventoryResponseDto responseDto = new UpdateInventoryResponseDto();
        try{
            Inventory inventory = inventoryService.updateInventory(requestDto.getProductId(), requestDto.getQuantity());
            responseDto.setInventory(inventory);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
