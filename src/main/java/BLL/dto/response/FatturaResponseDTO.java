package BLL.dto.response;

import BLL.dto.request.ContattoRequestDTO;
import BLL.dto.request.OrdineRequestDTO;

import java.time.LocalDate;

public class FatturaResponseDTO {

    private Long id;
    LocalDate data ;
    OrdineResponseDTO ordineResponseDTO ;
    ContattoResponseDTO contattoResponseDTO ;
}
