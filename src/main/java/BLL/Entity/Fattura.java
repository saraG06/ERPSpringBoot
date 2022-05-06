package BLL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

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

    @ManyToOne
    private Cliente cliente;
}