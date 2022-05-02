package Entities;

import javax.persistence.*;

@Entity
@Table(name = "collaboratore")
@Inheritance(strategy = InheritanceType.JOINED)
public class Collaboratore extends Operatore {


    @OneToOne
    @JoinColumn(name = "operatore")
    private Operatore operatore;

    @ManyToOne
    private Azienda azienda;

    public Collaboratore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
    }


    public Collaboratore() {
        super();
    }



    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    @Override
    public String toString() {
        return "Collaboratore{" +
                "id="  +
                ", operatore=" + operatore +
                '}';
    }
}
