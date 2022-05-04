package it.unikey.DAL.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Invoice")
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @Column(name = "date", nullable = false)
    private LocalDate date;
    @OneToOne(mappedBy = "invoice")
    private Order order;
    @ManyToOne
    @JoinTable(name = "contact", joinColumns = @JoinColumn(name = "id"))
    private Contact contact;

    @ManyToOne
    @JoinTable(name = "company", joinColumns = @JoinColumn(name = "id"))
    private Company company;

    public Invoice(String date, Order o, Contact c) {
        this.date = LocalDate.parse(date);
        this.order = o;
        this.contact = c;
    }

    public Invoice() {

    }

    public int getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return " " + code + " " + date + " " + order.getCode() + " " + contact;
    }
}
