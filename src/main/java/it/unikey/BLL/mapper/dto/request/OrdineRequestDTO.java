package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.BLL.mapper.dto.response.OperatoreResponseDTO;
import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Fattura;
import it.unikey.DAL.Entity.Operatore;
import lombok.Data;

import java.time.LocalDate;

@Data
public class OrdineRequestDTO {

    private String dettaglio;
    private LocalDate dataImporto;
    private OperatoreRequestDTO operatoreRequestDTO;
    private ClienteRequestDTO clienteRequestDTO;
    private FatturaRequestDTO fatturaRequesteDTO;
}
