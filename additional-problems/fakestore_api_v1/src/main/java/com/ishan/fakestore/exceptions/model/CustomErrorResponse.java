package com.ishan.fakestore.exceptions.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CustomErrorResponse {
    private String code;
    private String message;
    private String developerMessage;
    private String moreInfo;
}