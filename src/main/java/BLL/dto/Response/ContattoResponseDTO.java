package BLL.dto.Response;

import lombok.Data;

@Data
public class ContattoResponseDTO extends PersonaResponseDTO{

    private Long id;
    private ClienteResponseDTO clienteResponseDTO;
}
