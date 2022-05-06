package it.unikey.erpspring.DAL.Entity;

import lombok.Data;

import javax.persistence.*;

@Data //possono non scrivere getter e setter e toString
@Entity
@Table(name = "ruoli")
public class Ruolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private enum ruoloassegnato {
        MANAGER,
        PROJECTMANAGER,
        OPERATOR
    }

    @Column(name = "ruolo", nullable = false)
    private String ruolo;

    @Column(name = "nome", unique = true, nullable = false)
    private String nome;

    @OneToOne(mappedBy = "ruolo")
    private Dipendente dipendente;
}
