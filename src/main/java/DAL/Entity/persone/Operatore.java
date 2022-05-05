package DAL.Entity.persone;

import DAL.Entity.Azienda;
import DAL.Entity.Ordine;
import DAL.Entity.Enum.Risorse;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id ;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;


//    @OneToMany(mappedBy = "operatore")
//    List<Ordine> ordini ;
}