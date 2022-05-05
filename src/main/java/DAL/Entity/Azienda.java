package DAL.Entity;

import lombok.Data;

import javax.persistence.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Data
@Table(name= "azienda")
@Entity
public class Azienda {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "azienda")
    private List<Operatore> listaOperatori;

}
