package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
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

    @Enumerated
    @Column(name = "ruolo")
    private Ruolo ruoli;

}
