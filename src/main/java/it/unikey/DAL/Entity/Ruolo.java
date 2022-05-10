package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Table(name= "ruolo")
@Entity
public class Ruolo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID ruolo", example = "1", required = true)
    private Long id;

    private enum RuoloAssegnato{
        MANAGER,
        PROJECTMANAGER,
        OPERATOR
    }
    @Column(name= "ruoloAssegnato", nullable = false)
    @ApiModelProperty(notes= "Ruolo assegnato", example = "MANAGER", required = true)
    private String ruoloAssegnato;

    @OneToOne(mappedBy = "ruolo")
    @ApiModelProperty(notes= "Relazione OneToOne con dipendente")
    private Dipendente dipendente;
}
