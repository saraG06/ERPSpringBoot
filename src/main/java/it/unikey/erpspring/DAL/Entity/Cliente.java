package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "piva")
    private String piva;

    @OneToMany(mappedBy = "cliente")
    private List<Fattura> fatture;

    @OneToMany(mappedBy = "clienti")
    private List<Contatto> contattos;

    @ManyToOne(cascade = CascadeType.ALL)
    private Azienda azienda;

}
