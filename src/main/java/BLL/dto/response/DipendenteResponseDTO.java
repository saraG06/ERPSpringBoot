package BLL.dto.response;

import BLL.dto.request.OperatoreRequestDTO;
import DAL.Entity.Enum.Risorse;
import DAL.Entity.Enum.Ruoli;

import java.time.LocalDate;

public class DipendenteResponseDTO {
    private Long id;
    OperatoreRequestDTO operatoreResponseDTO ;
    private LocalDate dataAssunzione ;
    private Risorse risorsa;
    private Ruoli ruolo;

}
