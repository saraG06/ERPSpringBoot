package com.example.jpatest.DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "dipendente")
@Entity
public class Dipendente extends Operatore implements Serializable {

    @Column(name = "assunzione", nullable = false)
    private LocalDate assunzione;
    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;

    @Column(name = "risorsa")
    private LocalDate risorsa;

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

    public LocalDate getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(LocalDate risorsa) {
        this.risorsa = risorsa;
    }
}
