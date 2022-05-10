package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "azienda")
public class Azienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",unique = true)
    private String nome;


    @OneToMany(mappedBy = "azienda",fetch = FetchType.LAZY)
    private List<Operatore> listaOperatore = new ArrayList<>();



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

    public List<Operatore> getListaOperatore() {
        return listaOperatore;
    }

    public void setListaOperatore(List<Operatore> listaOperatore) {
        this.listaOperatore = listaOperatore;
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
