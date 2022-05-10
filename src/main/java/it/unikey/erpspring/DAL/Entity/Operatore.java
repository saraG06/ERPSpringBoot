package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "operatore")
public class Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "dataNascita")
    private String dataNascita;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_azienda")
    private Azienda azienda;

}
