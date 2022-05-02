package Entities;

import Enums.Risorse;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "operatore")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Operatore extends Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @OneToMany(mappedBy = "operatore")
    private List<Ordine> ordine;

    @Enumerated(EnumType.STRING)
    private Risorse risorse ;




    public Operatore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
    }

    public Operatore() {

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }





    public Risorse getRisorse() {
        return risorse;
    }

    public void setRisorse(Risorse risorse) {
        this.risorse = risorse;
    }

    public List<Ordine> getOrdine() {
        return ordine;
    }

    public void setOrdine(List<Ordine> ordine) {
        this.ordine = ordine;
    }

    @Override
    public String toString() {
        return "Operatore{" +
                "id=" + id +
                ", persona=" +
                ", risorse=" + risorse +
                '}';
    }
}
