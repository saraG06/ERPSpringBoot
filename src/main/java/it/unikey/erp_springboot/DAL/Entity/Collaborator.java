package it.unikey.erp_springboot.DAL.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "collaborator")
public class Collaborator extends Operator{

    @OneToMany(mappedBy = "collaborator")
    List<Order> orders = new ArrayList<Order>();


}
