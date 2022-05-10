package it.unikey.DAL.Entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

import java.time.LocalDate;

@Data
@Table(name= "fattura")
@Entity
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes= "ID fattura", example = "1", required = true)
    private Long id;

    @Column(name= "data", nullable = false)
    @ApiModelProperty(notes= "Data di esecuzione fattura", example = "AAAA-MM-DD", required = true)
    private LocalDate data;

    @JoinColumn(name= "Contatto_id", nullable = false)
    @ManyToOne
    @ApiModelProperty(notes= "Contatto fattura", required = true)
    private Contatto contatto;

    @OneToOne(mappedBy = "fattura")
    @ApiModelProperty(notes= "Ordine fattura")
    private Ordine ordine;

}
