package BLL.dto.Response;

import lombok.Data;

@Data
public class PersonaResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private AziendaResponseDTO aziendaResponseDTO;
}
