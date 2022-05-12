package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "azienda")
@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Dipendente> listaDipendenti;
    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Collaboratore> listaCollaboratori;
    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Fattura> listaFatture;
    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Contatto> listaContatti;
    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Ordine> listaOrdini;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public void setListaDipendenti(List<Dipendente> listaDipendenti) {
        this.listaDipendenti = listaDipendenti;
    }

    public List<Collaboratore> getListaCollaboratori() {
        return listaCollaboratori;
    }

    public void setListaCollaboratori(List<Collaboratore> listaCollaboratori) {
        this.listaCollaboratori = listaCollaboratori;
    }

    public List<Fattura> getListaFatture() {
        return listaFatture;
    }

    public void setListaFatture(List<Fattura> listaFatture) {
        this.listaFatture = listaFatture;
    }

    public List<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }

    public List<Ordine> getListaOrdini() {
        return listaOrdini;
    }

    public void setListaOrdini(List<Ordine> listaOrdini) {
        this.listaOrdini = listaOrdini;
    }
}
