package BLL.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(mappedBy = "dipendente")
    private List<Risorsa> risorsas;


    /*@Column(name = "ruolo")
    private List<Ruolo> ruoli;*/

}
