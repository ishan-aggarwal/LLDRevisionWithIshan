package com.ishan.showads.dtos;

import com.ishan.showads.models.Advertisement;
import lombok.Data;

@Data
public class GetAdvertisementForUserResponseDto {
    private Advertisement advertisement;
    private ResponseStatus responseStatus;
}
