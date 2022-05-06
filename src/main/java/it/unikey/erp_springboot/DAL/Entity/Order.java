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
    @ManyToOne
    @JoinTable(name = "client", joinColumns = @JoinColumn(name = "id"))
    private Client client;
    @ManyToOne
    @JoinTable(name = "operator", joinColumns = @JoinColumn(name = "id"))
    private Operator operator;
    @OneToOne(mappedBy = "order")
    Invoice invoice;
    @ManyToOne
    Collaborator collaborator;
    @ManyToOne
    @JoinTable(name = "contact", joinColumns = @JoinColumn(name = "id"))
    private Company company;
    @ManyToOne
    Employee employee;

}
