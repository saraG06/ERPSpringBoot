package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "operatore")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID operatore", example = "1", required = true)
    private Long id;

    @Column(name= "nome", nullable = false)
    @ApiModelProperty(notes= "Nome operatore", example = "Mario", required = true)
    private String nome;

    @Column(name= "cognome", nullable = false)
    @ApiModelProperty(notes= "Cognome operatore", example = "Rossi", required = true)
    private String cognome;

    @Column(name= "nascita", nullable = false)
    @ApiModelProperty(notes= "Data di nascita operatore", example = "AAAA-MM-DD", required = true)
    private LocalDate nascita;

    @OneToMany(mappedBy = "operatore")
    @ApiModelProperty(notes= "Relazione OneToMany con lista di risorse")
    private List<Risorsa> listaRisorse= new ArrayList<>();

    @OneToMany(mappedBy = "operatore")
    @ApiModelProperty(notes= "Relazione OneToMany con lista di ordini")
    private List<Ordine> listaOrdini= new ArrayList<>();

    @JoinColumn(name= "Azienda_id", nullable = false)
    @ManyToOne
    @ApiModelProperty(notes= "Relazione ManyToOne con azienda")
    private Azienda azienda;

}
