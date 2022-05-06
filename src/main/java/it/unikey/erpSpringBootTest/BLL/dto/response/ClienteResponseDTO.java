package it.unikey.erpSpringBootTest.BLL.dto.response;

import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import lombok.Data;

import java.util.List;

@Data
public class ClienteResponseDTO {

    private Long id;
    private String nome;
    private String pIva;
    private List<ContattoResponseDTO> contattoResponseDTOList;
}
