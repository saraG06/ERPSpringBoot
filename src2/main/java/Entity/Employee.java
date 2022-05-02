package Entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surnname;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "dateOfEmployment")
    private LocalDate dateOfEmployment;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}
