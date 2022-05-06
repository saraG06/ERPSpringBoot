package BLL.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "contatto")
public class Contatto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cognome")
    private String cognome;

    @ManyToOne
    private Cliente clienti;

    @ManyToMany
    Set<Fattura> fatturas;
}
