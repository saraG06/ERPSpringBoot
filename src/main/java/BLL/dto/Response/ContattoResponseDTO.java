package BLL.dto.Response;

import lombok.Data;

@Data
public class ContattoResponseDTO {

    private Long id;
    private ClienteResponseDTO clienteResponseDTO;
    private String nome;
    private String cognome;
}
