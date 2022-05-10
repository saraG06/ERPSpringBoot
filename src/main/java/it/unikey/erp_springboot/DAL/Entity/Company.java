package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany(mappedBy = "company")
    private List<Client> clients;
    @OneToMany(mappedBy = "company")
    private List<Invoice> invoices;
    @OneToMany(mappedBy = "company")
    private List<Order> orders;
    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
    @OneToMany(mappedBy = "company")
    private List<Operator> operators;

}
