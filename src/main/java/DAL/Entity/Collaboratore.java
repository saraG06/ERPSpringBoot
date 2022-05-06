package DAL.Entity;

import javax.persistence.*;

@Entity
@Table(name = "collaboratore")
public class Collaboratore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Operatore operatore;

    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                ", operatore=" + operatore +
                '}';
    }
}
