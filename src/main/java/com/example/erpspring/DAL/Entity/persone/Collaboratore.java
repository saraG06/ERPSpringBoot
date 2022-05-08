package com.example.erpspring.DAL.Entity.persone;

import com.example.erpspring.DAL.Entity.Azienda;
import com.example.erpspring.DAL.Entity.Enum.Risorse;
import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "collaboratore")
@Entity
public class Collaboratore  {

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

    public Collaboratore() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Risorse getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorse risorsa) {
        this.risorsa = risorsa;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }
}
