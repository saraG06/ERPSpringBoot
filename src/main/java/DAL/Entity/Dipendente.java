package DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
@Data
@Table(name= "dipendente")
@Entity
public class Dipendente implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name= "assunzione", nullable = false)
    private LocalDate assunzione;

    @OneToOne()
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    private Operatore operatore;

    @JoinColumn(name= "Ruolo_id", referencedColumnName = "id", nullable = false)
    @OneToOne
    private Ruolo ruolo;
}
