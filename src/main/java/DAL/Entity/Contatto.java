package DAL.Entity;

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

    @ManyToMany
    Set<Fattura> fatturas;
}
