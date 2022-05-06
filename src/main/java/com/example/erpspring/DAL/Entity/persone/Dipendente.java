package com.example.erpspring.DAL.Entity.persone;


import com.example.erpspring.DAL.Entity.Enum.Risorse;
import com.example.erpspring.DAL.Entity.Enum.Ruoli;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "dipendente")
@Entity
public class Dipendente extends Operatore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id ;
    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToOne
    private Operatore operatore ;

    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated
    @Column(name = "ruolo")
    private Ruoli ruolo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Risorse getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorse risorsa) {
        this.risorsa = risorsa;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Ruoli getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        this.ruolo = ruolo;
    }
}
