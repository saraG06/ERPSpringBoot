package entity;


import enumerators.Role;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="employee")
public class Employee extends Worker{


    @Column(name = "hiringDate")
    private LocalDate hiringDate;
    @Enumerated
    @Column(name = "role")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;



    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", hiringDate=" + hiringDate +
                ", role=" + role +
                ", company=" + company +
                "} " + super.toString();
    }
}
