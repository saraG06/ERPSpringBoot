package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "collaboratore")
@Entity
public class Collaboratore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Operatore o;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Azienda azienda;

    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Risorsa risorsa;

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
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

    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }
}
