package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.AziendaResponseDTO;
import it.unikey.BLL.mapper.dto.response.OrdineResponseDTO;
import it.unikey.BLL.mapper.dto.response.RisorsaResponseDTO;
import it.unikey.DAL.Entity.Azienda;
import it.unikey.DAL.Entity.Ordine;
import it.unikey.DAL.Entity.Risorsa;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate nascita;
    private List<RisorsaResponseDTO> listaRisorsaResponseDTO;
    private List<OrdineResponseDTO> listaOrdineResponseDTO;
    private AziendaResponseDTO aziendaResponseDTO;
}
