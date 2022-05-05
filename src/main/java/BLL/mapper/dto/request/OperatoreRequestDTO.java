package BLL.mapper.dto.request;

import DAL.Entity.Azienda;
import DAL.Entity.Ordine;
import DAL.Entity.Risorsa;
import lombok.Data;

import java.util.List;

@Data
public class OperatoreRequestDTO {

    private List<Risorsa> listaRisorse;
    private List<Ordine> listaOrdini;
    private Azienda azienda;
}
