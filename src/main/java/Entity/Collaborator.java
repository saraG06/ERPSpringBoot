package Entity;

import Entity.Enum.Resources;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "collaborator")
public class Collaborator extends Operator implements Serializable {
    private int code;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "birth", nullable = false)
    private LocalDate birth;
    @Enumerated
    @Column(name = "resource", nullable = false)
    private Resources resource;

    @OneToMany(mappedBy = "collaborator")
    private List<Order> orders;

    public Collaborator( String name, String surname, String birth, String resource) {
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
        this.resource = Resources.valueOf(resource.toUpperCase());;
    }

    public Collaborator() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Resources getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }

    @Override
    public String toString() {
        return code +" " + name + " " + surname + " " + birth + " " + resource.name();
    }
}
