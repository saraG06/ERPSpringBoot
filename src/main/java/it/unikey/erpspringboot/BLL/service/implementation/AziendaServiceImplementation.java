package it.unikey.erpspringboot.BLL.service.implementation;

import it.unikey.erpspringboot.BLL.dto.Request.AziendaRequestDTO;
import it.unikey.erpspringboot.BLL.dto.Response.AziendaResponseDTO;
import it.unikey.erpspringboot.BLL.mapper.implementation.request.*;
import it.unikey.erpspringboot.BLL.mapper.implementation.response.AziendaResponseMapper;
import it.unikey.erpspringboot.BLL.service.abstraction.AziendaService;
import it.unikey.erpspringboot.DAL.Entity.*;
import it.unikey.erpspringboot.DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AziendaServiceImplementation implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;

    private final OperatoreRequestMapper operatoreRequestMapper;



    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        List<Operatore> listaOperatori = operatoreRequestMapper.asEntityList(aziendaRequestDTO.getOperatoreRequestDTOList());
        a.setListaOperatore(listaOperatori);
        aziendaRepository.save(a);
    }

    @Override
    public AziendaResponseDTO findById(Long id) throws NullPointerException{

        Azienda a = aziendaRepository.getById(id);
        if(a != null)
            return aziendaResponseMapper.asDTO(a);
        else
            throw new NullPointerException();
    }

    @Override
    public void deleteAziendaById(Long id)  throws NullPointerException{

        Azienda a = aziendaRepository.getById(id);
        if(a !=null)
            aziendaRepository.deleteById(id);
        else
            throw new NullPointerException();
    }

    @Override
    public List<AziendaResponseDTO> findAllAzienda() {

        List<Azienda> lista = aziendaRepository.findAll();

        return aziendaResponseMapper.asDTOList(lista);
    }

   /* @Override
    public AziendaResponseDTO findByNome(String nome) {
        Azienda a = aziendaRepository.findByNome(nome);
        return aziendaResponseMapper.asDTO(a);
    }

    */
}
