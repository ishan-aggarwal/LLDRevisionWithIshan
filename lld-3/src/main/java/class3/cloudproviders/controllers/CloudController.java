package class3.cloudproviders.controllers;

import class3.cloudproviders.dtos.CreateConnectionRequestDto;
import class3.cloudproviders.dtos.CreateConnectionResponseDto;
import class3.cloudproviders.dtos.ResponseStatus;
import class3.cloudproviders.exceptions.UserNotFoundException;
import class3.cloudproviders.models.Connection;
import class3.cloudproviders.services.CloudService;

public class CloudController {
    private CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    public CreateConnectionResponseDto createConnection(CreateConnectionRequestDto createConnectionRequestDto) {
        CreateConnectionResponseDto responseDto = new CreateConnectionResponseDto();
        try {
            Connection connection = cloudService.createConnection(createConnectionRequestDto.getUserId());
            responseDto.setConnectionId(connection.getConnectionId());
            responseDto.setConnectionStatus(connection.getConnectionStatus());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (UserNotFoundException e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
