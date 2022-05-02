package Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity

@Table(name = "fattura")
public class Fattura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @OneToOne
    private Ordine ordini;

    @OneToOne
    private Contatto contatto;

    @ManyToOne
    @JoinColumn(name = "azienda_id")
    private Azienda azienda;
}
