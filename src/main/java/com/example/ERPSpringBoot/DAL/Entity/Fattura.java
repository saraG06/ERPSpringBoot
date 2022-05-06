package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "fattura")
@Entity
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data", nullable = false)
    private LocalDate data;
    @ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Contatto contatto;
    @OneToOne
    private Ordine ordine;

    @ManyToOne
    private Azienda azienda;

    public LocalDate getData() {
        return data;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }
}
