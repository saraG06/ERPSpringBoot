package it.unikey.erp_springboot.DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends Operator{

    @Column(name = "role")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "company")
    private Company company;
    @OneToMany(mappedBy = "employee")
    private List<Order> orders = new ArrayList<Order>();

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
                super.toString()+
                ", role=" + role +
                ", company=" + company +
                ", orders=" + orders +
                '}';
    }
}
