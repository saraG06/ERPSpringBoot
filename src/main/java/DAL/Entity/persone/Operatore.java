package DAL.Entity.persone;

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
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;
    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToMany(mappedBy = "operatore")
    List<Ordine> ordini ;
}
