package it.unikey.erpspring.DAL.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "pIva")
    private String pIva;

    @OneToMany(mappedBy = "cliente")
    private List<Fattura> fatture;

    @OneToMany(mappedBy = "clienti")
    private List<Contatto> contattos;

    @ManyToOne
    private Azienda azienda;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pIva='" + pIva + '\'' +
                ", azienda=" + azienda +
                '}';
    }
}
