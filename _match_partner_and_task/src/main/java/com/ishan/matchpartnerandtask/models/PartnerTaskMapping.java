package com.ishan.matchpartnerandtask.models;

import lombok.Data;

@Data
public class PartnerTaskMapping extends BaseModel{
    private Partner partner;
    private Task task;
}