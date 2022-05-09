package com.example.erpspring.DAL.Entity;


import com.example.erpspring.DAL.Entity.persone.Contatto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Table(name = "fattura")
@Entity
public class Fattura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data")
    LocalDate data;
    @OneToOne(cascade = CascadeType.ALL)
    Ordine ordine;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contatto_id")
    Contatto contatto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "azienda_id")
    Azienda azienda;

//    public Fattura(String data,Ordine ordine,Contatto contatto) {
//        this.data = LocalDate.parse(data);
//        this.contatto = contatto ;
//        this.ordine = ordine ;
//    }

}

