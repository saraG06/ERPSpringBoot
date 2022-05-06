package com.example.erpspring.DAL.Entity.persone;

import com.example.erpspring.DAL.Entity.Enum.Risorse;

import javax.persistence.*;

@Table(name = "collaboratore")
@Entity
public class Collaboratore extends Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id ;


    @Enumerated
    @Column(name = "risorsa")
    Risorse risorsa ;

    @OneToOne
    private Operatore operatore ;

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
