package it.unikey.BLL.mapper.dto.request;

import it.unikey.BLL.mapper.dto.response.ClienteResponseDTO;
import it.unikey.BLL.mapper.dto.response.FatturaResponseDTO;
import it.unikey.DAL.Entity.Cliente;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContattoRequestDTO {

    private String nome;
    private String cognome;
    private LocalDate nascita;
    private ClienteResponseDTO clienteResponseDTO;
    private List<FatturaResponseDTO> listaFatturaResponseDTO;

}
