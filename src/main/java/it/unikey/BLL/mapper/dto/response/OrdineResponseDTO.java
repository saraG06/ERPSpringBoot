package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Fattura;
import it.unikey.DAL.Entity.Operatore;
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
