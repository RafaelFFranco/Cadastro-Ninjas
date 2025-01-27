package dev.java10x.CadastroDeNinjas.Ninja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //declarar que é um controller
@RequestMapping
public class NinjaController {

    @GetMapping("/BemVindo") //Ação de Get
    public String boasVindas(){
        return "Boas Vindas";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Criado com sucesso";
    }

    //Procurara Ninja por id (READ)
    @GetMapping("/")
    public String mostrarNinjasPorId(){
        return "Criado com sucesso";
    }
    //Mostrar todos os Ninjas (READ)
    @GetMapping("/all")
    public String mostrarTodosNinjas(){
        return "Criado com sucesso";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "Criado com sucesso";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaId(){
        return "Criado com sucesso";
    }
}
