package class8.inventorymanagement.dtos;

import class8.inventorymanagement.models.Inventory;
import lombok.Data;

@Data
public class CreateOrUpdateResponseDto {
    private Inventory inventory;
    private ResponseStatus responseStatus;
}
