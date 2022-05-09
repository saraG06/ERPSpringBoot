package com.example.erpspring.DAL.Entity.persone;


import com.example.erpspring.DAL.Entity.Azienda;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import com.example.erpspring.DAL.Entity.Enum.Ruoli;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Table(name = "dipendente")
@Entity
public class Dipendente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToOne(cascade=CascadeType.ALL)
    private Operatore operatore ;

    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated
    @Column(name = "ruolo")
    private Ruoli ruolo;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;


}
