package it.unikey.ERPSpringBoot.BLL.dto.response;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class WorkerResponseDto {

    private Long id;
    private String name;
    private String lastname;
    private LocalDate birthdate;
    private List<OrderResponseDto> orderResponseDtoList;
    private CollaboratorResponseDto collaboratorResponseDto;
}
