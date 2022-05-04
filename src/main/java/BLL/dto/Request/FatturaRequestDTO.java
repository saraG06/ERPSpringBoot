package BLL.dto.Request;

import lombok.Data;

import java.time.LocalDate;


@Data
public class FatturaRequestDTO {

    private LocalDate data;
    private ContattoRequestDTO contattoRequestDTO;
    private OrdineRequestDTO ordineRequestDTO;
}
