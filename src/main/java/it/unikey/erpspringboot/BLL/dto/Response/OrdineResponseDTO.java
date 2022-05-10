package it.unikey.erpspringboot.BLL.dto.Response;

import it.unikey.erpspringboot.BLL.dto.Request.FatturaRequestDTO;
import lombok.Data;

import java.time.LocalDate;
@Data
public class OrdineResponseDTO {

    private Long id;
    private String dettaglio;
    private LocalDate dataImporto;
    private OperatoreResponseDTO operatoreResponseDTO;
    private ClienteResponseDTO clienteResponseDTO;
    private FatturaResponseDTO fatturaResponseDTO;
}