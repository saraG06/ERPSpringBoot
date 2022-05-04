package it.unikey.erpspringboot;

import DAL.Entity.Azienda;
import DAL.Repository.AziendaRepository;
import DAL.SpringProvaApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

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
