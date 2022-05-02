package Repository;

import Entity.Azienda;
import Entity.SpringProvaApplication;
import Repository.AziendaRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@SpringBootTest(classes = SpringProvaApplication.class)
@DataJpaTest

class SpringProvaApplicationTests {
     @Autowired
    private AziendaRepository aziendaRepository;
    @Test
    void contextLoads() {
    }

    @Test
    void addAzienda(){
        Azienda a = new Azienda();
        a.setNome("unikey");
        aziendaRepository.save(a);

        List<Azienda> aziende = aziendaRepository.findAll();
       for(Azienda az : aziende){
           System.out.println(az);
       }
    }

}
