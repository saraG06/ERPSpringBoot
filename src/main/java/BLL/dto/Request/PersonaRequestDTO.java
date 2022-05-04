package BLL.dto.Request;

import lombok.Data;

@Data
public class PersonaRequestDTO {

    private String nome;
    private String cognome;
    private AziendaRequestDTO aziendaRequestDTO;
}
