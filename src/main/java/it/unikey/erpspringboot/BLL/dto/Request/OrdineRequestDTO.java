package it.unikey.erpspringboot.BLL.dto.Request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineRequestDTO {

    private String dettaglio;
    private LocalDate dataImporto;
    private OperatoreRequestDTO operatoreRequestDTO;
    private ClienteRequestDTO clienteRequestDTO;
}
