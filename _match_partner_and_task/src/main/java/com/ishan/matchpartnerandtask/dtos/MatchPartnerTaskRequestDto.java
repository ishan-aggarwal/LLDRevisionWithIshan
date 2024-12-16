package com.ishan.matchpartnerandtask.dtos;

import lombok.Data;

import java.util.List;

@Data
public class MatchPartnerTaskRequestDto {
    private List<Long> partnerIds;
    private List<Long> taskIds;
}