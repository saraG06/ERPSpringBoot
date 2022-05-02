package Entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee extends Worker{


    @ManyToOne
    @JoinColumn(name = "streams_id")
    private Streams streams;

    @Override
    public String toString() {
        return "Employee{" +

                ", streams=" + streams +
                '}';
    }
}
