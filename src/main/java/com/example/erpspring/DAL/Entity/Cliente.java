package com.example.erpspring.DAL.Entity;

import com.example.erpspring.DAL.Entity.persone.Contatto;

import javax.persistence.*;
import java.util.List;

@Table(name = "cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "pIva")
    String pIva ;
    @OneToMany(mappedBy = "cliente" , fetch= FetchType.LAZY)
    private List<Contatto> contatti ;
    @OneToMany(mappedBy = "cliente" , fetch= FetchType.LAZY)
    private List<Ordine> ordini ;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;

    public Cliente() {
         }

    public boolean hasContatto(Contatto c){
        return contatti.contains(c);
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ordine> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<Ordine> ordini) {
        this.ordini = ordini;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }



}
