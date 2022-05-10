package it.unikey.erpspring.DAL.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "iva")
    private String iva;
    @OneToMany(mappedBy = "client")
    private List<Contact> contacts;
    @OneToMany(mappedBy = "client")
    private List<Order> orders;
    @OneToMany(mappedBy = "client")
    private List<Invoice> invoices;

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

    public String getIva() {
        return iva;
    }

    public void setIva(String IVA) {
        this.iva = IVA;
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

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }


    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iva='" + iva + '\'' +
                '}';
    }
}
