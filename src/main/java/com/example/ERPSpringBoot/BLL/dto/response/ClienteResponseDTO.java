package com.example.ERPSpringBoot.BLL.dto.response;

import lombok.Data;
import java.util.List;
@Data
public class ClienteResponseDTO {
    private Long id;
    private String nome;
    private String PI;
    private List<ContattoResponseDTO> contattoResponseDTOList;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
