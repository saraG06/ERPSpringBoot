package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "lastname", nullable = false)
    private String lastname;
    @Column(name = "birthday", nullable = false)
    private LocalDate birth;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @OneToMany(mappedBy = "contact")
    private List<Invoice> invoices = new ArrayList<Invoice>();

}
