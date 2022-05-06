package it.unikey.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class WorkerRequestDto {

    private String name;
    private String lastname;
    private LocalDate birthdate;
    private List<OrderRequestDto> orderRequestDtoList;
    private CollaboratorRequestDto collaboratorRequestDto;
}
