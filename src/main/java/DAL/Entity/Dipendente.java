package DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dipendenti")
public class Dipendente extends Operatore{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "assunzione",nullable = false)
    private LocalDate assunzione;

    @ManyToOne
    @JoinColumn(name = "ruolo_id",nullable = false)
    private Ruolo ruolo;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getAssunzione() {
        return assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", assunzione=" + assunzione +
                ", ruolo=" + ruolo +
                '}';
    }
}
