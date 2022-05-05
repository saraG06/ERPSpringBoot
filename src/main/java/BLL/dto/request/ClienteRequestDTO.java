package BLL.dto.request;

import DAL.Entity.Ordine;

import java.util.List;

public class ClienteRequestDTO {
    private List<ContattoRequestDTO> contattoRequestDTOList ;
    private List<OrdineRequestDTO> ordineRequestDTOList ;
    private String nome;
    private String pIva ;

}
