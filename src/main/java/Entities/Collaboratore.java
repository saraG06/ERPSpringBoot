package Entities;

import javax.persistence.*;

@Entity
@Table(name = "collaboratore")
public class Collaboratore extends Operatore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Collaboratore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
    }


    public Collaboratore() {
        super();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                '}';
    }
}
