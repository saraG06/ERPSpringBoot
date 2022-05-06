package it.unikey.erpSpringBootTest.BLL.dto.response;

import it.unikey.erpSpringBootTest.DAL.Entity.Contatto;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FatturaResponseDTO {

    private Long id;
    private LocalDate data;
    private OrdineResponseDTO ordineResponseDTO;
    private ContattoResponseDTO contattoResponseDTO;
}
