package DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dipendente")
public class Dipendente{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Operatore operatore;

    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;

    @ManyToOne
    @JoinColumn(name = "id")
    private Azienda azienda;


    /*@Column(name = "ruolo")
    private List<Ruolo> ruoli;*/

}
