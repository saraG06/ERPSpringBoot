package com.example.erpspring.BLL.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class ClienteResponseDTO implements Serializable {

    private Long id;
    private String nome;
    private String pIva ;
    private List<ContattoResponseDTO> contattoResponseDTOList;

}
