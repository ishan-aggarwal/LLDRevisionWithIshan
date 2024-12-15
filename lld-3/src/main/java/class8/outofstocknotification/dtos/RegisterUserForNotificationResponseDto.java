package class8.outofstocknotification.dtos;

import class8.outofstocknotification.models.Notification;
import lombok.Data;

@Data
public class RegisterUserForNotificationResponseDto {
    private Notification notification;
    private ResponseStatus responseStatus;
}
