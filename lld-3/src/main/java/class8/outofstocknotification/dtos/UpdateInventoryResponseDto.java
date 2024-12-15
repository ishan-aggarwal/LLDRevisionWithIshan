package class8.outofstocknotification.dtos;

import class8.outofstocknotification.models.Inventory;
import lombok.Data;

@Data
public class UpdateInventoryResponseDto {
    private Inventory inventory;
    private ResponseStatus responseStatus;
}
