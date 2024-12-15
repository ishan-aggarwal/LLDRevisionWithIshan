package class8.cancelorder.dtos;

import class8.cancelorder.models.Order;
import lombok.Data;

@Data
public class CancelOrderResponseDto {
    private ResponseStatus status;
    private Order order;
}
