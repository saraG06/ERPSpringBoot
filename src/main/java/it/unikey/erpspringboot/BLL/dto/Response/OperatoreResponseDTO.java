package it.unikey.erpspringboot.BLL.dto.Response;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
@Data
public class OperatoreResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private AziendaResponseDTO aziendaResponseDTO;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
