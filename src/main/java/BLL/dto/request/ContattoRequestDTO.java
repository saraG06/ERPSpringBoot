package BLL.dto.request;

import DAL.Entity.Cliente;
import DAL.Entity.Fattura;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

public class ContattoRequestDTO {

    private String nome;

    private String cognome;

    private LocalDate dataNascita ;

    private ClienteRequestDTO clienteRequestDTO ;

    private List<FatturaRequestDTO> fatturaRequestDTOList;
}
