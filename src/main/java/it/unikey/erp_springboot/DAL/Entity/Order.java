package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "details")
    private String details;
    @Column(name = "date", nullable = false)
    private LocalDate date;
    @Column(name = "price", nullable = false)
    private Double price;
    @ManyToOne
    @JoinColumn(name = "collaborator")
    private Collaborator collaborator;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "employee")
    private Employee employee;
    @OneToOne(mappedBy = "order")
    private Invoice invoice;

}
