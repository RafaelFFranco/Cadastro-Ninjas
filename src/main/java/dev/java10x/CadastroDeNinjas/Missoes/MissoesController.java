package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//RestController diz que é uma rota para a API
@RestController
@RequestMapping("/missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Criado com sucesso!";
    }

    @PutMapping("/alterarID")
    public String alterarMissao(){
        return "Alterado com sucesso!";
    }

    @GetMapping("/all")
    public String mostrarTodasMissoes(){
        return "Listado de missoes";
    }

    @GetMapping("/procurarPorID")
    public String mostrarMissaoPorId(){
        return "Listado com sucesso";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissao(){
        return "Deletado com sucesso!";
    }


}
