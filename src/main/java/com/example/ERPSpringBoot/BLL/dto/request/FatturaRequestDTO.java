package com.example.ERPSpringBoot.BLL.dto.request;

import lombok.Data;
import java.time.LocalDate;

@Data
public class FatturaRequestDTO {
    private LocalDate data;
    private ContattoRequestDTO contattoRequestDTO;
    private OrdineRequestDTO ordineRequestDTO;
    private AziendaRequestDTO aziendaRequestDTO;
}
