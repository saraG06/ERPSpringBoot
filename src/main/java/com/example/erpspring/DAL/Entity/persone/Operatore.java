package com.example.erpspring.DAL.Entity.persone;

import com.example.erpspring.DAL.Entity.Azienda;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Table(name = "operatore")
@Entity
public class Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;

//    @ManyToOne(cascade=CascadeType.ALL)
//    @JoinColumn(name = "azienda_id")
//    Azienda azienda ;


//    @OneToMany(mappedBy = "operatore")
//    List<Ordine> ordini ;


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

//    public Azienda getAzienda() {
//        return azienda;
//    }
//
//    public void setAzienda(Azienda azienda) {
//        this.azienda = azienda;
//    }
}