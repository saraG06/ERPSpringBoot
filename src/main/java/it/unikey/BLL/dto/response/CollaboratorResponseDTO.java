package it.unikey.BLL.dto.response;

import it.unikey.BLL.dto.request.OrderRequestDTO;
import it.unikey.DAL.Entity.Enum.Resources;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CollaboratorResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private LocalDate birth;
    private Resources resource;
    private List<OrderRequestDTO> orderRequestDTOList;
}
