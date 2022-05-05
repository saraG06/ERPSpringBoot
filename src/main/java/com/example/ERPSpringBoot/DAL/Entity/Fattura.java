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
    @ManyToOne
    @JoinTable(name = "contatto", joinColumns = @JoinColumn(name = "id"))
    private Contatto contatto;
    @OneToOne
    private Ordine ordine;

    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;

    public Fattura(LocalDate data, Contatto contatto, Ordine ordine) {
        this.data = data;
        this.contatto= contatto;
        this.ordine= ordine;
    }

    public Fattura() {

    }

    public LocalDate getData() {
        return data;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    @Override
    public String toString() {
        return "Fattura{" +
                "codice=" + id +
                ", data=" + data +
                ", contatto=" + contatto +
                ", ordine=" + ordine +
                '}';
    }
}
