package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity

@Table(name = "ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @OneToOne
    private Operatore operatore;

    @OneToOne
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    private Azienda azienda;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente clienti;

    
}
