package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;

import java.time.LocalDate;

@Data
@Table(name= "fattura")
@Entity
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "data", nullable = false)
    private LocalDate data;

    @JoinColumn(name= "Contatto_id", nullable = false)
    @ManyToOne
    private Contatto contatto;

    @OneToOne(mappedBy = "fattura")
    private Ordine ordine;

}
