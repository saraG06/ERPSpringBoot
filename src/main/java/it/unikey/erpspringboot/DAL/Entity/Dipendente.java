package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "dipendenti")
public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "assunzione",nullable = false)
    private LocalDate assunzione;

    @ManyToOne
    @JoinColumn(name = "ruolo_id",nullable = false)
    private Ruolo ruolo;

    @ManyToOne
    @JoinColumn(name = "risorsa_id")
    private Risorsa risorsa;

    @OneToOne
    @JoinColumn(name = "operatore_id", referencedColumnName = "id")
    private Operatore operatore;


    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public Long getId() {
        return id;
    }

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
