package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;

import java.util.List;
@Data
public class ClienteRequestDTO {

    private String nome;
    private String PI;
    private List<ContattoRequestDTO> contattoRequestDTOList;
    private List<OrdineRequestDTO> ordineRequestDTOList;
}
