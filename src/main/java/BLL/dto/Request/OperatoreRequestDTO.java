package BLL.dto.Request;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreRequestDTO{

    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private AziendaRequestDTO aziendaRequestDTO;
    private List<OrdineRequestDTO> ordineRequestDTOList;
}
