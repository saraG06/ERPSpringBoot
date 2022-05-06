package it.unikey.erp_springboot.DAL.Entity;

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
    @ManyToOne
    @JoinColumn(name = "contact")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;

}
