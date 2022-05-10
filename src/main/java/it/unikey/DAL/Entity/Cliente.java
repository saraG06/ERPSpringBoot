package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID cliente", example = "1", required = true)
    private Long id;

    @Column(name= "nome", nullable = false)
    @ApiModelProperty(notes= "Nome cliente", example = "Mario", required = true)
    private String nome;

    @Column(name= "PI", nullable = false, unique = true)
    @ApiModelProperty(notes= "Cognome cliente", example = "Rossi", required = true)
    private String PI;

    @OneToMany(mappedBy = "cliente")
    @ApiModelProperty(notes= "Relazione OneToMany con lista dei contatti", required = false)
    private List<Contatto> listaContatti= new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    @ApiModelProperty(notes= "Relazione OneToMany con lista degli ordini", required = false)
    private List<Ordine> listaOrdini= new ArrayList<>();

}
