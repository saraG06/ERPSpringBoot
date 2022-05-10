package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ordine")
    private Azienda azienda;

    @OneToOne
    @JoinColumn(name = "ordine_id",nullable = true)
    private Fattura fatture;
    
}
