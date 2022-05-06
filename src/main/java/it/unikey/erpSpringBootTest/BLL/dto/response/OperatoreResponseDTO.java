package it.unikey.erpSpringBootTest.BLL.dto.response;

import it.unikey.erpSpringBootTest.DAL.Entity.Ordine;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OperatoreResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    private List<OrdineResponseDTO> ordineResponseDTOList;
}
