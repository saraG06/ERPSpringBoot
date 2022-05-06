package it.unikey.erpSpringBootTest.BLL.dto.request;

import lombok.Data;

import java.util.List;
@Data
public class ClienteRequestDTO {

    private String nome;
    private String pIva;
    private List<ContattoRequestDTO> contattoRequestDTOList;
    private List<FatturaRequestDTO> fatturaRequestDTOList;
}
