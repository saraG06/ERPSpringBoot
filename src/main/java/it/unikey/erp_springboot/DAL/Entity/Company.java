package it.unikey.erp_springboot.DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "company")
    private List<Client> clients = new ArrayList<Client>();
    @OneToMany(mappedBy = "company")
    private List<Operator> operators = new ArrayList<Operator>();
    @OneToMany(mappedBy = "company")
    private List<Invoice> invoices = new ArrayList<Invoice>();
}
