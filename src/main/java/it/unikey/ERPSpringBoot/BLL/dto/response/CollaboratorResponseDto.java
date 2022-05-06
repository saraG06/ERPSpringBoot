package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.util.List;
@Data
public class CollaboratorResponseDto {

    private Long id;
    private WorkerResponseDto workerResponseDto;
    private String name;
    private String lastname;
    private String birthdate;
    private OrderResponseDto orderResponseDto;
    private List<ResourceResponseDto> resourceResponseDtoList;
}
