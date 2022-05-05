package it.unikey.erpspringboot.DAL.Entity;

import javax.persistence.*;

@Entity
@Table(name = "risorse")
public class Risorsa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome" ,unique = true,nullable = false)
    private String nome;

    @Override
    public String toString() {
        return "Risorsa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

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
}
