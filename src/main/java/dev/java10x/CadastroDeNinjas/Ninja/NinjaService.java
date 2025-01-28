package dev.java10x.CadastroDeNinjas.Ninja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    //Listar todos os Ninjas
    //resgata todos os ninjas cadastrados
    //equivale ao SELECT* do sql
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Busca ninja no BD
    //Optional é para tentar buscar algo que existe
    //Esse método retorna um NinjaModel ou null
    public NinjaModel buscarNinjaId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }
}
