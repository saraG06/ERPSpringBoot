package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "dipendente")
@Entity
public class Dipendente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Operatore o;
    @Column(name = "assunzione", nullable = false)
    private LocalDate assunzione;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Azienda azienda;

    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Risorsa risorsa;

    private enum Ruolo{
        MANAGER,
        PROJECTMANAGER,
        OPERATOR
    }

    @Column(name = "ruolo", nullable = false)
    private String ruolo;

    public LocalDate getAssunzione() {
        return assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Operatore getO() {
        return o;
    }

    public void setO(Operatore o) {
        this.o = o;
    }
}