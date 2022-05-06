package DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name= "ordine")
@Entity
public class Ordine {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name= "dettaglio", nullable = false)
    private String dettaglio;

    @Column(name= "dataImporto", nullable = false)
    private LocalDate dataImporto;

    @JoinColumn(name= "Operatore_id", nullable = false)
    @ManyToOne
    private Operatore operatore;

    @JoinColumn(name= "Cliente_id", nullable = false)
    @ManyToOne
    private Cliente cliente;

    @JoinColumn(name= "Fattura_id", referencedColumnName = "id", nullable = true)
    @OneToOne
    private Fattura fattura;

}
