package BLL.mapper.dto.request;

import DAL.Entity.Operatore;
import lombok.Data;

@Data
public class RisorsaRequestDTO {

    private String risorsaAssegnata;
    private Operatore operatore;
}
