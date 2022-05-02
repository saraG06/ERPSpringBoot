package Entities;

import javax.persistence.*;

@Entity
@Table(name = "contatto")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Contatto extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @OneToOne
    @JoinColumn(name = "persona", unique = true, nullable = false)
    private Persona persona;
    @ManyToOne
    private Cliente cliente;

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
