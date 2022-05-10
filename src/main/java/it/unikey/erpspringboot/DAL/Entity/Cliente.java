package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clienti")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome",nullable = false)
    private String nome;

    @Column(name = "pi" , unique = true,nullable = false)
    private String PI;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    List<Ordine> ordini = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    List<Contatto> contatti = new ArrayList<>();

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

    public String getPI() {
        return PI;
    }

    public void setPI(String PI) {
        this.PI = PI;
    }

    public List<Ordine> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<Ordine> ordini) {
        this.ordini = ordini;
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", PI='" + PI + '\'' +
                '}';
    }
}
