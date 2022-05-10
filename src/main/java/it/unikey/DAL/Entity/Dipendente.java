package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Table(name= "dipendente")
@Entity
public class Dipendente implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID dipendente", example = "1", required = true)
    private Long id;

    @Column(name= "assunzione", nullable = false)
    @ApiModelProperty(notes= "Data di assunzione dipendente", example = "AAAA-MM-DD", required = true)
    private LocalDate assunzione;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    @ApiModelProperty(notes= "Relazione OneToOne con operatore", required = true)
    private Operatore operatore;

    @JoinColumn(name= "Ruolo_id", referencedColumnName = "id", nullable = false)
    @OneToOne
    @ApiModelProperty(notes= "Ruolo dipendente", example = "OPERATOR", required = true)
    private Ruolo ruolo;
}
