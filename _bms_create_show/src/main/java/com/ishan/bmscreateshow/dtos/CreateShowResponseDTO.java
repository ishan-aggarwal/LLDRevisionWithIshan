package com.ishan.bmscreateshow.dtos;

import com.ishan.bmscreateshow.models.Show;
import lombok.Data;

@Data
public class CreateShowResponseDTO {
    private ResponseStatus responseStatus;
    private Show show;
}
