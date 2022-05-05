package BLL.mapper.dto.response;

import DAL.Entity.Azienda;
import DAL.Entity.Ordine;
import DAL.Entity.Risorsa;
import lombok.Data;

import java.util.List;

@Data
public class OperatoreResponseDTO {

    private Long id;
    private List<Risorsa> listaRisorse;
    private List<Ordine> listaOrdini;
    private Azienda azienda;
}
