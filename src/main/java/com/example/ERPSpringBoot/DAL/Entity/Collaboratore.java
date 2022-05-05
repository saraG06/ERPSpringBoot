package com.example.ERPSpringBoot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "collaboratore")
@Entity
public class Collaboratore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Operatore o;
    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;

    @ManyToOne
    @JoinColumn(name = "risorsa_id",nullable = false)
    private Risorsa risorsa;

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }
}
