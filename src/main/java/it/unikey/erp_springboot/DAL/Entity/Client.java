package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pIVA", nullable = false)
    private String partitaIVA;
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts = new ArrayList<Contact>();
    @OneToMany(mappedBy = "client")
    private List<Order> orders = new ArrayList<Order>();
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
}