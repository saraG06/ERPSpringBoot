package it.unikey.DAL.Entity;

import it.unikey.DAL.Entity.Enum.Resources;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "collaborator")
public class Collaborator implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    @Column(name = "resource", nullable = false)
    private Resources resource;

    @OneToMany(mappedBy = "collaborator",cascade=CascadeType.ALL)
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @OneToOne
    @JoinColumn(name = "operatore_id", referencedColumnName = "id", nullable = false)
    private Operator operator;

    public Collaborator() {

    }

    public Resources getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }
}

