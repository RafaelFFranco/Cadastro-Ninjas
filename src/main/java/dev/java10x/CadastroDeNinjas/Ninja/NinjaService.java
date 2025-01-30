package dev.java10x.CadastroDeNinjas.Ninja;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;


    public NinjaService(NinjaRepository ninjaRepository,NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    //Listar todos os Ninjas
    //resgata todos os ninjas cadastrados
    //equivale ao SELECT* do sql
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Busca ninja no BD
    //Optional é para tentar buscar algo que existe
    //Esse metodo retorna um NinjaModel ou null
    public NinjaModel buscarNinjaId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Cria um novo Ninja no BD
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
       return ninjaMapper.map(ninjaModel);
    }

    //Deleta um Ninja do BD
    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    //Atualizar ninja
    //Procura se o Ninja existe, se existir ele sobreescreve o ninja antigo com os novos dados enviados
    public NinjaModel atualizarNinja(NinjaModel ninjaAtualizado, Long id){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }

        return null;
    }
}
