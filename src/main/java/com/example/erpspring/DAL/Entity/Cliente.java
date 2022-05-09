package com.example.erpspring.DAL.Entity;

import com.example.erpspring.DAL.Entity.persone.Contatto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
@Data
@Table(name = "cliente")
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "pIva")
    String pIva ;
    @OneToMany(mappedBy = "cliente" , cascade=CascadeType.ALL)
    private List<Contatto> contatti ;
    @OneToMany(mappedBy = "cliente" , cascade=CascadeType.ALL)
    private List<Ordine> ordini ;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;

//    public Cliente() {
//         }





}
