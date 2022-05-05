package BLL.dto.response;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.request.FatturaRequestDTO;

import java.time.LocalDate;
import java.util.List;

public class ContattoResponseDTO {
    private Long id;
    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    private ClienteResponseDTO clienteResponseDTO ;

    private List<FatturaResponseDTO> fatturaResponseDTOList;
}
