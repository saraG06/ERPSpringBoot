package com.example.erpspring.DAL.Entity.persone;

import com.example.erpspring.DAL.Entity.Azienda;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Table(name = "operatore")
@Entity
public class Operatore implements Serializable {

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




//    public Azienda getAzienda() {
//        return azienda;
//    }
//
//    public void setAzienda(Azienda azienda) {
//        this.azienda = azienda;
//    }
}