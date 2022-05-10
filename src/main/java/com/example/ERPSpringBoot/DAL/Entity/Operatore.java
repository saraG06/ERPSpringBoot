package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cognome", nullable = false)
    private String cognome;
    @Column(name = "nascita")
    private LocalDate nascita;

    @OneToMany(mappedBy = "operatore", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Ordine> ordine;
    @OneToMany(mappedBy = "operatore", cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Risorsa> risorseAssegnate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }

    public List<Ordine> getOrdine() {
        return ordine;
    }

    public void setOrdine(List<Ordine> ordine) {
        this.ordine = ordine;
    }

    public List<Risorsa> getRisorseAssegnate() {
        return risorseAssegnate;
    }

    public void setRisorseAssegnate(List<Risorsa> risorseAssegnate) {
        this.risorseAssegnate = risorseAssegnate;
    }

}
