package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "dipendente")
public class Dipendente extends Operatore implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dataAssunzione")
    private LocalDate dataAssunzione;
    @Enumerated(EnumType.STRING)
    @Column(name = "ruolo")
    private Ruoli ruolo;


    public Dipendente(String nome, String cognome, String dataNascita,String dataAssunzione,String ruolo) {
        super(nome, cognome, dataNascita);
        this.dataAssunzione = LocalDate.parse(dataAssunzione);
        this.ruolo = Ruoli.valueOf(ruolo.toUpperCase());

    }

    public Dipendente() {
    }

    public void assegnaRisorsa(Dipendente d, Risorse r){
        if (this.getRuolo().equals(Ruoli.MANAGER) || d.getRuolo().getI() > this.getRuolo().getI()) {
            d.addRisorsa(r.name());
            System.out.println("Assegnata!");
        }
        else {
            System.out.println("Impossibile assegnare risorsa");
        }
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Ruoli getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "id=" + id +
                ", dataAssunzione=" + dataAssunzione +
                ", ruolo=" + ruolo +
                '}';
    }
}
