package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name = "contatto")
@Entity
public class Contatto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "cognome", nullable = false)
    private String cognome;
    @Column(name = "nascita", nullable = false)
    private LocalDate nascita;
    @ManyToOne
    @JoinTable(name = "cliente", joinColumns = @JoinColumn(name = "id"))
    private Cliente cliente;
    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;
    @OneToMany(mappedBy = "contatto")
    private List<Fattura> fattura;
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
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public List<Fattura> getFattura() {
        return fattura;
    }

    public void setFattura(List<Fattura> fattura) {
        this.fattura = fattura;
    }
}
