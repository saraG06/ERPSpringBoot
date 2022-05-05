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

    @Column(name= "dettaglio")
    private String dettaglio;

    @Column(name= "dataImporto")
    private LocalDate dataImporto;

    @JoinColumn(name= "Operatore_id")
    @ManyToOne
    private Operatore operatore;

    @JoinColumn(name= "Cliente_id")
    @ManyToOne
    private Cliente cliente;

    @JoinColumn(name= "Fattura_id", referencedColumnName = "id")
    @OneToOne
    private Fattura fattura;

}
