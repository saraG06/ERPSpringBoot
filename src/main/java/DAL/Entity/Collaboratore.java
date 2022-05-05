package DAL.Entity;

import javax.persistence.*;

@Entity
@Table(name = "collaboratori")
public class Collaboratore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "operatore_id", referencedColumnName = "id")
    private Operatore operatore;

    @ManyToOne
    @JoinColumn(name = "risorsa_id",nullable = false)
    private Risorsa risorsa;

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


    @Override
    public String toString() {
        return "Collaboratore{" +
                "id=" + id +
                '}';
    }
}
