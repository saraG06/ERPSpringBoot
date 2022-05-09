package com.example.erpspring.DAL.Entity.persone;

import com.example.erpspring.DAL.Entity.Azienda;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "collaboratore")
@Entity
public class Collaboratore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToOne(cascade=CascadeType.ALL)
    private Operatore operatore ;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "azienda_id")
    Azienda azienda ;


}
