package it.unikey.ERPSpringBoot.BLL.dto.request;


import lombok.Data;

import java.util.List;
@Data
public class EmployeeRequestDto {

    private StreamsRequestDto streamsRequestDto;
    private List<ResourceRequestDto> resourceRequestDtoList;

}
