package DAL.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "azienda")
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "azienda")
    private List<Operatore> operatori;

    @OneToMany(mappedBy = "azienda")
    private List<Cliente> clienti;

    @OneToMany(mappedBy = "azienda")
    private List<Dipendente> dipendenti;

    @OneToMany(mappedBy = "azienda")
    private List<Collaboratore> collaboratori;

    @OneToMany(mappedBy = "azienda")
    private List<Ordine> ordini;

    @Override
    public String toString() {
        return "Azienda{" +
                "id=" + id +
                ", operatori=" + operatori +
                ", clienti=" + clienti +
                ", dipendenti=" + dipendenti +
                ", collaboratori=" + collaboratori +
                ", ordini=" + ordini +
                '}';
    }
}
