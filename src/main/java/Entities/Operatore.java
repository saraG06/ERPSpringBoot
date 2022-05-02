package Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "operatore")
public abstract class Operatore extends Persona implements Serializable {
    @Enumerated(EnumType.STRING)
    @Column(name = "risorse")
    HashSet<Risorse> risorse ;

    public Operatore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
        risorse = new HashSet();
    }

    public Operatore() {

    }

    public void addRisorsa(String r){
        risorse.add(Risorse.valueOf(r.toUpperCase())) ;
    }

    public HashSet<Risorse> getRisorse() {
        return risorse;
    }

    @Override
    public String toString() {
        return "Operatore{" +
                super.toString() +
                "risorse=" + risorse +
                '}';
    }
}
