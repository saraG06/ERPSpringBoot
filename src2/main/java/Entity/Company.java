package Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Client> clients;

    @OneToMany(mappedBy = "company")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "company")
    private List<Order> orders;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;
}
