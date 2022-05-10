package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
@Data
@Table(name= "collaboratore")
@Entity
public class Collaboratore {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID collaboratore", example = "1", required = true)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    @ApiModelProperty(notes= "Relazione OneToOne con operatore", required = true)
    private Operatore operatore;

}
