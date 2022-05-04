package DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "operatori")
public class Operatore extends Persona{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "risorsa_id",nullable = false)
    private Risorsa risorsa;

    @OneToMany(mappedBy = "operatore", fetch = FetchType.LAZY)
    private List<Ordine> ordini = new ArrayList<>();

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Risorsa getRisorsa() {
        return risorsa;
    }

    public void setRisorsa(Risorsa risorsa) {
        this.risorsa = risorsa;
    }

    @Override
    public String toString() {
        return "Operatore{" +
                "id=" + id +
                ", risorsa=" + risorsa +
                '}';
    }
}
