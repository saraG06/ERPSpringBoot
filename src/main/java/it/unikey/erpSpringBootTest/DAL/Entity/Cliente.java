package it.unikey.erpSpringBootTest.DAL.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome ;
    @Column(name = "pIva")
    private String pIva ;
    @OneToMany(mappedBy = "cliente")
    private List<Contatto> contatti;
    @OneToMany(mappedBy = "cliente")
    private List<Fattura> fatture;
    @ManyToOne
    private Ordine ordine;
    @ManyToOne
    private Azienda azienda;

    public Cliente(String nome, String pIva) {
        this.nome = nome;
        this.pIva = pIva;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean hasContatto(Contatto c){
        return contatti.contains(c);
    }

    public List<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(List<Contatto> contatti) {
        this.contatti = contatti;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }
}
