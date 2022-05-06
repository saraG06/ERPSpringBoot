package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.util.List;
@Data
public class CollaboratorRequestDto {

    private WorkerRequestDto workerRequestDto;
    private String name;
    private String lastname;
    private String birthdate;
    private OrderRequestDto orderRequestDto;
    private List<ResourceRequestDto> resourceRequestDtoList;
}
