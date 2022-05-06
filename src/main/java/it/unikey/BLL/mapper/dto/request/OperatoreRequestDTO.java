package it.unikey.BLL.mapper.dto.request;

import it.unikey.DAL.Entity.Azienda;
import it.unikey.DAL.Entity.Ordine;
import it.unikey.DAL.Entity.Risorsa;
import lombok.Data;

import java.util.List;

@Data
public class OperatoreRequestDTO {

    private List<Risorsa> listaRisorse;
    private List<Ordine> listaOrdini;
    private Azienda azienda;
}
