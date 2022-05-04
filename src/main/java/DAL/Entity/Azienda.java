package DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "azienda")
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;


    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY)
    private List<Dipendente> listaDipendenti = new ArrayList<>();

    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY)
    private List<Collaboratore> listaCollaboratori = new ArrayList<>();

    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY)
    private List<Contatto> listaContatti = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public void setListaDipendenti(List<Dipendente> listaDipendenti) {
        this.listaDipendenti = listaDipendenti;
    }

    public List<Collaboratore> getListaCollaboratori() {
        return listaCollaboratori;
    }

    public void setListaCollaboratori(List<Collaboratore> listaCollaboratori) {
        this.listaCollaboratori = listaCollaboratori;
    }


    public List<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(List<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }


    @Override
    public String toString() {
        return "Azienda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
