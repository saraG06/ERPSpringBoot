package DAL.Entity.persone;


import DAL.Entity.Azienda;
import DAL.Entity.Enum.Risorse;
import DAL.Entity.Enum.Ruoli;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "dipendente")
@Entity
public class Dipendente extends Operatore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id ;

    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToOne
    private Operatore operatore ;


    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated
    @Column(name = "ruolo")
    private Ruoli ruolo;


}
