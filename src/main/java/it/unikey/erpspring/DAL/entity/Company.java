package it.unikey.erpspring.DAL.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "company")
    private List<Employee> employeeList;
    @OneToMany(mappedBy = "company")
    private List<Order> orderList;
    @OneToMany(mappedBy = "company")
    private List<Invoice> invoiceList;
}
