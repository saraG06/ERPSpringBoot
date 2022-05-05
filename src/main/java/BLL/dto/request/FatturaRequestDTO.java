package BLL.dto.request;

import DAL.Entity.Ordine;
import DAL.Entity.persone.Contatto;
import java.time.LocalDate;

public class FatturaRequestDTO {

    LocalDate data ;
    OrdineRequestDTO ordineRequestDTO ;
    ContattoRequestDTO contattoRequestDTO ;
}
