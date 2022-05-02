package Entities;

import javax.persistence.*;

@Entity
@Table(name = "contatto")
public class Contatto extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "persona")
    @JoinColumn(name = "persona", unique = true, nullable = false)
    private Persona persona;

    public Contatto() {
    }

    public Contatto(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Contatto{" +
                "id=" + id +
                ", persona=" + persona +
                '}';
    }
}
