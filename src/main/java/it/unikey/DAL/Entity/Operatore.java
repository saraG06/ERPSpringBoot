package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "operatore")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nome", nullable = false)
    private String nome;

    @Column(name= "cognome", nullable = false)
    private String cognome;

    @Column(name= "nascita", nullable = false)
    private LocalDate nascita;

    @OneToMany(mappedBy = "operatore")
    private List<Risorsa> listaRisorse= new ArrayList<>();

    @OneToMany(mappedBy = "operatore")
    private List<Ordine> listaOrdini= new ArrayList<>();

    @JoinColumn(name= "Azienda_id", nullable = false)
    @ManyToOne
    private Azienda azienda;

}
