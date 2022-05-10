package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "PI")
    private String PI;
    @OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Contatto> contatto;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private List<Ordine> ordine;

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

    public String getPI() {
        return PI;
    }

    public void setPI(String PI) {
        this.PI = PI;
    }

    public List<Contatto> getContatto() {
        return contatto;
    }

    public void setContatto(List<Contatto> contatto) {
        this.contatto = contatto;
    }

    public List<Ordine> getOrdine() {
        return ordine;
    }

    public void setOrdine(List<Ordine> ordine) {
        this.ordine = ordine;
    }
}
