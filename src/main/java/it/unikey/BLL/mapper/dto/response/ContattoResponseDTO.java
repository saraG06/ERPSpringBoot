package it.unikey.BLL.mapper.dto.response;

import it.unikey.DAL.Entity.Cliente;
import it.unikey.DAL.Entity.Fattura;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContattoResponseDTO {

    private Long id;
    private String cognome;
    private LocalDate nascita;
    private ClienteResponseDTO clienteResponseDTO;
    private List<FatturaResponseDTO> listaFatturaResponseDTO;
}
