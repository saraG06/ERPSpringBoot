package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Table(name = "azienda")
@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "azienda")
    private List<Dipendente> listaDipendenti;
    @OneToMany(mappedBy = "azienda")
    private List<Collaboratore> listaCollaboratori = new ArrayList<Collaboratore>();
    @OneToMany(mappedBy = "azienda")
    private List<Fattura> listaFatture;
    @OneToMany(mappedBy = "azienda")
    private List<Contatto> listaContatti;
    @OneToMany(mappedBy = "azienda")
    private List<Ordine> listaOrdini;


}
