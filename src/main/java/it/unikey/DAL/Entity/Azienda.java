package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name= "azienda")
@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID azienda", example = "1", required = true)
    private Long id;

    @OneToMany(mappedBy = "azienda")
    @ApiModelProperty(notes= "Relazione OneToMany con lista di operatori", required = false)
    private List<Operatore> listaOperatori;

}
