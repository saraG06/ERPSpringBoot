package it.unikey.BLL.dto.request;

import it.unikey.DAL.Entity.Enum.Resources;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CollaboratorRequestDTO {

    private String name;
    private String surname;
    private LocalDate birth;
    private Resources resource;
    private List<OrderRequestDTO> orderRequestDTOList;
}
