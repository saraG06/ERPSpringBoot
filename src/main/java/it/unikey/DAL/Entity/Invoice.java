package it.unikey.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Invoice")
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date", nullable = false)
    private LocalDate date;
    @OneToOne
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @ManyToOne(cascade=CascadeType.ALL)
    private Contact contact;

    @ManyToOne(cascade=CascadeType.ALL)
    private Company company;

    public Invoice(String date, Order o, Contact c) {
        this.date = LocalDate.parse(date);
        this.order = o;
        this.contact = c;
    }

    public Invoice() {

    }
}
