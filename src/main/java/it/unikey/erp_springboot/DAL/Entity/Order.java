package it.unikey.erp_springboot.DAL.Entity;

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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operator")
    private Operator operator;
    @OneToOne(mappedBy = "order")
    Invoice invoice;
    @ManyToOne(cascade = CascadeType.ALL)
    Collaborator collaborator;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact")
    private Company company;
    @ManyToOne(cascade = CascadeType.ALL)
    Employee employee;

}
