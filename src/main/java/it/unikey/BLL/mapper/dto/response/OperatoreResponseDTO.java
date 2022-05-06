package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Azienda;
import it.unikey.DAL.Entity.Ordine;
import it.unikey.DAL.Entity.Risorsa;
import lombok.Data;

import java.util.List;

@Data
public class OperatoreResponseDTO {

    private Long id;
    private List<Risorsa> listaRisorse;
    private List<Ordine> listaOrdini;
    private Azienda azienda;
}
