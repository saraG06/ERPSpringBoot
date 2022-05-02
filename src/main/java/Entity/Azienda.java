package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="azienda")
public class Azienda {

    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY)
    private List<Collaboratore> collaboratori;

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY)
    private List<Dipendente> dipendenti;

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY)
    private List<Cliente> clienti;

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY)
    private List<Fattura> fatture;

    @OneToMany(mappedBy = "azienda", fetch = FetchType.LAZY)
    private List<Ordine> ordini;

}
