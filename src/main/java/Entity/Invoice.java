package Entity;

import org.hibernate.mapping.Join;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "invoice")

public class Invoice {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "date")
    private LocalDate date;

    @OneToOne(mappedBy = "invoice")
    private Order order;

    @OneToOne
    @JoinColumn(name = "contact_id", referencedColumnName = "id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name="streams_id")
    private Streams streams;

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
        return "Invoice{" +
                "id=" + id +
                ", date=" + date +
                ", order=" + order +
                ", contact=" + contact +
                ", client=" + client +
                ", streams=" + streams +
                '}';
    }
}
