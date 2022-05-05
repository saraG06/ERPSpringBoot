package BLL.dto.request;

import DAL.Entity.Enum.Risorse;
import DAL.Entity.Enum.Ruoli;

import java.time.LocalDate;

public class DipendenteRequestDTO {

    OperatoreRequestDTO operatoreRequestDTO ;
    private LocalDate dataAssunzione ;
    private Risorse risorsa;
    private Ruoli ruolo;

}
