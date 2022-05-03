package Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Table(name = "contatto")
@Entity
public class Contatto extends Persona{
    @ManyToOne
    @JoinTable(name = "cliente", joinColumns = @JoinColumn(name = "id"))
    private Cliente cliente;
    @ManyToOne
    @JoinTable(name = "azienda", joinColumns = @JoinColumn(name = "id"))
    private Azienda azienda;
    @OneToMany(mappedBy = "contatto")
    private List<Fattura> fattura;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Azienda getAzienda() {
        return azienda;
    }

    public void setAzienda(Azienda azienda) {
        this.azienda = azienda;
    }

    public List<Fattura> getFattura() {
        return fattura;
    }

    public void setFattura(List<Fattura> fattura) {
        this.fattura = fattura;
    }
}
