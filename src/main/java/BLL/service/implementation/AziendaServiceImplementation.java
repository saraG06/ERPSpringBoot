package BLL.service.implementation;

import BLL.dto.Request.AziendaRequestDTO;
import BLL.dto.Response.AziendaResponseDTO;
import BLL.mapper.implementation.request.AziendaRequestMapper;
import BLL.mapper.implementation.request.CollaboratoreRequestMapper;
import BLL.mapper.implementation.request.ContattoRequestMapper;
import BLL.mapper.implementation.request.DipendenteRequestMapper;
import BLL.mapper.implementation.response.AziendaResponseMapper;
import BLL.service.abstraction.AziendaService;
import DAL.Entity.Azienda;
import DAL.Entity.Collaboratore;
import DAL.Entity.Contatto;
import DAL.Entity.Dipendente;
import DAL.Repository.AziendaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AziendaServiceImplementation implements AziendaService {

    private final AziendaRepository aziendaRepository;
    private final AziendaRequestMapper aziendaRequestMapper;
    private final AziendaResponseMapper aziendaResponseMapper;

    private final DipendenteRequestMapper dipendenteRequestMapper;
    private final CollaboratoreRequestMapper collaboratoreRequestMapper;
    private final ContattoRequestMapper contattoRequestMapper;


    @Override
    public void saveAzienda(AziendaRequestDTO aziendaRequestDTO) {
        Azienda a = aziendaRequestMapper.asEntity(aziendaRequestDTO);
        List<Dipendente> listaDipendenti = dipendenteRequestMapper.asEntityList(aziendaRequestDTO.getDipendenteRequestDTOList());
        List<Collaboratore> listaCollaboratori = collaboratoreRequestMapper.asEntityList(aziendaRequestDTO.getCollaboratoreRequestDTOList());
        List<Contatto> listaContatti = contattoRequestMapper.asEntityList(aziendaRequestDTO.getContattoRequestDTOList());
        a.setListaDipendenti(listaDipendenti);
        a.setListaCollaboratori(listaCollaboratori);
        a.setListaContatti(listaContatti);
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
}
