package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


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
    @JoinColumn(name = "company_id")
    private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}