package Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Table(name = "collaboratore")
@Entity
public class Collaboratore extends Operatore{

    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;

    @Column(name = "risorsa")
    private LocalDate risorsa;

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }
}
