package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.util.List;
@Data
public class EmployeeResponseDto {

    private Long id;
    private StreamsResponseDto streamsResponseDto;
    private List<ResourceResponseDto> resourceResponseDtoList;
}
