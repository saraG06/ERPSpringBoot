package it.unikey.erpspringboot.BLL.dto.Request;

import lombok.Data;

@Data
public class ContattoRequestDTO {

    private ClienteRequestDTO clienteRequestDTO;
    private String nome;
    private String cognome;
}
