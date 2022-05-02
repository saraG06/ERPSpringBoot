package Entity;

import javax.persistence.*;
import java.util.*;

@Entity

@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "pIva")
    private String pIva;

    @OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY)
    private List<Contatto> contatti;

    @OneToMany(mappedBy = "clienti",fetch = FetchType.LAZY)
    private List<Ordine> ordini;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    private Azienda azienda;
}
