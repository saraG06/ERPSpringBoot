package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Table(name= "cliente")
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name= "nome", nullable = false)
    private String nome;

    @Column(name= "PI", nullable = false, unique = true)
    private String PI;

    @OneToMany(mappedBy = "cliente")
    private List<Contatto> listaContatti= new ArrayList<>();

    @OneToMany(mappedBy = "cliente")
    private List<Ordine> listaOrdini= new ArrayList<>();

}
