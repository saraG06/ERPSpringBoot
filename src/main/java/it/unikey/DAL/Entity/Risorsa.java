package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name= "risorsa")
@Entity
public class Risorsa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID risorsa", example = "1", required = true)
    private Long id;

    private enum RisorsaAssegnata{
        MACCHINA,
        PC,
        TELEFONO
    }
    @Column(name= "risorsaAssegnata", nullable = false)
    @ApiModelProperty(notes= "Risorsa assegnata", example = "MACCHINA", required = true)
    private String risorsaAssegnata;

    @JoinColumn(name= "Operatore_id", nullable = false)
    @ManyToOne
    @ApiModelProperty(notes= "Relazione ManyToOne con operatore", required = true)
    private Operatore operatore;

}
