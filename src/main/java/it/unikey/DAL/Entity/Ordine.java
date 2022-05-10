package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name= "ordine")
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID ordine", example = "1", required = true)
    private Long id;

    @Column(name= "dettaglio", nullable = false)
    @ApiModelProperty(notes= "Dettaglio ordine", example = "Progetto interno", required = true)
    private String dettaglio;

    @Column(name= "dataImporto", nullable = false)
    @ApiModelProperty(notes= "Data dell'importo dell'ordine", example = "AAAA-MM-DD", required = true)
    private LocalDate dataImporto;

    @JoinColumn(name= "Operatore_id", nullable = false)
    @ManyToOne
    @ApiModelProperty(notes= "Relazione ManyToOne con operatore", required = true)
    private Operatore operatore;

    @JoinColumn(name= "Cliente_id", nullable = false)
    @ManyToOne
    @ApiModelProperty(notes= "Relazione ManyToOne con cliente", required = true)
    private Cliente cliente;

    @JoinColumn(name= "Fattura_id", referencedColumnName = "id", nullable = true)
    @OneToOne
    @ApiModelProperty(notes= "Relazione OneToOne con fattura", required = false)
    private Fattura fattura;

}
