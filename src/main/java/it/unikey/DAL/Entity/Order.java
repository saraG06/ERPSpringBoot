package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

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
    @ManyToOne
    @JoinTable(name = "client", joinColumns = @JoinColumn(name = "id"))
    private Client client;
    @ManyToOne
    @JoinTable(name = "operator", joinColumns = @JoinColumn(name = "id"))
    private Operator operator;

    @ManyToOne
    @JoinTable(name = "contact", joinColumns = @JoinColumn(name = "id"))
    private Company company;

    @OneToOne
    private Invoice invoice;

    public Order(String details, String date, double price, Operator o, Client cl) {
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.client = cl;
        this.operator = o;
    }

    public Order() {
    }
}
