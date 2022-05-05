package BLL.dto.response;

import BLL.dto.request.ClienteRequestDTO;
import BLL.dto.request.OperatoreRequestDTO;

import java.time.LocalDate;

public class OrdineResponseDTO {

    private Long id;
    LocalDate data ;
    double importo ;
    String dettaglio ;

    OperatoreResponseDTO operatoreResponseDTO ;

    ClienteResponseDTO clienteResponseDTO ;
}
