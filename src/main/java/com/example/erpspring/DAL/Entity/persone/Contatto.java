package com.example.erpspring.DAL.Entity.persone;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.example.erpspring.DAL.Entity.Cliente;
import com.example.erpspring.DAL.Entity.Fattura;
import lombok.Data;
@Data
@Table(name = "contatto")
@Entity
public class Contatto  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;
    @Column(name = "dataNascita")
    private LocalDate dataNascita ;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cliente_id" )
    private Cliente cliente ;
    @OneToMany(mappedBy = "contatto", cascade=CascadeType.ALL)
    private List<Fattura> fatture;




}
