package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "partitaIVA", nullable = false)
    private String partitaIVA;
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts;

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

    @ManyToOne
    private Company company;

    public Client(String name, String partitaIVA) {
        this.name = name;
        this.partitaIVA = partitaIVA;
        this.contacts = new ArrayList<>();
    }

    public Client() {
    }

}
