package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name= "risorsa")
@Entity
public class Risorsa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private enum RisorsaAssegnata{
        MACCHINA,
        PC,
        TELEFONO
    }
    @Column(name= "risorsaAssegnata", nullable = false)
    private String risorsaAssegnata;

    @JoinColumn(name= "Operatore_id", nullable = false)
    @ManyToOne
    private Operatore operatore;

}
