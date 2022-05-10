package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "contatto")
@Entity
public class Contatto{

    //La classe padre avrà ancora gli elementi in comune tra le classi figlie
    //La classe figlia avrà l'id, gli attributi propri e una OneToOne sulla classe padre

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID contatto", example = "1", required = true)
    private Long id;

    @Column(name= "nome", nullable = false)
    @ApiModelProperty(notes= "Nome contatto", example = "Mario", required = true)
    private String nome;

    @Column(name= "cognome", nullable = false)
    @ApiModelProperty(notes= "Cognome contatto", example = "Rossi", required = true)
    private String cognome;

    @Column(name= "nascita", nullable = false)
    @ApiModelProperty(notes= "Data di nascita contatto", example = "AAAA-MM-DD", required = true)
    private LocalDate nascita;

    @JoinColumn(name= "Cliente_id", nullable = true)
    @ManyToOne
    @ApiModelProperty(notes= "Relazione ManyToOne con cliente", required = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "contatto")
    @ApiModelProperty(notes= "Relazione OneToMany con lista di fatture")
    private List<Fattura> listaFatture= new ArrayList<>();

}
