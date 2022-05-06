package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "risorse")
public class Risorsa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private enum risorsaAssegnata {
        MACCHINA,
        PC,
        TELEFONO
    }

    @Column(name = "risorsa", nullable = false)
    private String risorsa;

    @JoinColumn(name = "operatore_id", nullable = false)
    @ManyToOne
    private Dipendente dipendente;
}
