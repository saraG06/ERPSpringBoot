package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

@Data
@Entity
@Table(name = "`order`")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "details", nullable = false)
    private String details;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @Column(name = "price", nullable = false)
    private double price;
    @ManyToOne(cascade=CascadeType.ALL)
    private Client client;
    @ManyToOne(cascade=CascadeType.ALL)
    private Operator operator;

    @ManyToOne(cascade=CascadeType.ALL)
    private Company company;

    @ManyToOne(cascade=CascadeType.ALL)
    private Collaborator collaborator;


    public Order(String details, String date, double price, Operator o, Client cl) {
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.client = cl;
        this.operator = o;
    }

    public Order() {
    }

    @ManyToOne(cascade=CascadeType.ALL)
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @OneToOne(mappedBy = "order",cascade=CascadeType.ALL)
    private Invoice invoice;

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
