package dev.java10x.CadastroDeNinjas.Ninja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //declarar que é um controller
@RequestMapping("/ninjas")
public class NinjaController {

    //Injeção de dependência
    private NinjaService ninjaService;
    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }


    @GetMapping("/BemVindo") //Ação de Get
    public String boasVindas() {
        return "Boas Vindas";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO) {
        return ninjaService.criarNinja(ninjaDTO);
    }

    //Procurara Ninja por id (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel buscarNinjaId(@PathVariable Long id) {
        return ninjaService.buscarNinjaId(id);
    }

    //Mostrar todos os Ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinja(@RequestBody NinjaModel ninjaModel, @PathVariable Long id) {
        return ninjaService.atualizarNinja(ninjaModel, id);
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaId(@PathVariable Long id) {
        ninjaService.deleteNinja(id);
    }
}
