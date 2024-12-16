package com.ishan.matchpartnerandtask.dtos;

import com.ishan.matchpartnerandtask.models.PartnerTaskMapping;
import lombok.Data;

import java.util.List;

@Data
public class MatchPartnerTaskResponseDto {
    private List<PartnerTaskMapping> partnerTaskMappings;
    private ResponseStatus responseStatus;
}