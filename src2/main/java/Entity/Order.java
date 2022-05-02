package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "details")
    private String details;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "price")
    private double price;

    @OneToOne
    private Collaborator collaborator;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    private Employee employee;
}
