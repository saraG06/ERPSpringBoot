package it.unikey.erpspring.BLL.DTO.response;

import it.unikey.erpspring.BLL.DTO.request.OrderRequestDTO;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

;

@Data
public class WorkerResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private List<OrderRequestDTO> orderRequestDTOList;
}
