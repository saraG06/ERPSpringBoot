package DAL.Entity.persone;

import DAL.Entity.Azienda;
import DAL.Entity.Enum.Risorse;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "collaboratore")
@Entity
public class Collaboratore extends Operatore {

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

    @OneToOne
    private Operatore operatore ;

    public Collaboratore() {

    }




}
