package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Azienda;
import it.unikey.DAL.Entity.Ordine;
import it.unikey.DAL.Entity.Risorsa;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate nascita;
    private List<RisorsaResponseDTO> listaRisorsaResponseDTO;
    private List<OrdineResponseDTO> listaOrdineResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
}
