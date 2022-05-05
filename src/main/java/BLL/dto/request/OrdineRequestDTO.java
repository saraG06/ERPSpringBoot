package BLL.dto.request;

import java.time.LocalDate;

public class OrdineRequestDTO {

    LocalDate data ;
    double importo ;
    String dettaglio ;

    OperatoreRequestDTO operatoreRequestDTO ;

    ClienteRequestDTO clienteRequestDTO ;
}
