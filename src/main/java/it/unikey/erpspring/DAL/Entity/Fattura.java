package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "fattura")
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @OneToOne
    private Ordine ordine;

    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;
}
