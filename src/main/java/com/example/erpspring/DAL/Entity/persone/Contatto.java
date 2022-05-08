package com.example.erpspring.DAL.Entity.persone;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

import com.example.erpspring.DAL.Entity.Cliente;
import com.example.erpspring.DAL.Entity.Fattura;
import lombok.Data;
@Data
@Table(name = "contatto")
@Entity
public class Contatto  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cliente_id" )
    private Cliente cliente ;
    @OneToMany(mappedBy = "contatto", cascade=CascadeType.ALL)
    private List<Fattura> fatture;

    public Contatto() {
    }

    public Contatto(String nome, String cognome, LocalDate dataNascita, Cliente cliente) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.cliente = cliente;
    }

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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Fattura> getFatture() {
        return fatture;
    }

    public void setFatture(List<Fattura> fatture) {
        this.fatture = fatture;
    }
}
