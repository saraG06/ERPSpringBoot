package DAL.Entity.persone;


import DAL.Entity.Azienda;
import DAL.Entity.Enum.Ruoli;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "dipendente")
@Entity
public class Dipendente extends Operatore implements Serializable {


    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated
    @Column(name = "ruolo")
    private Ruoli ruolo;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;



}
