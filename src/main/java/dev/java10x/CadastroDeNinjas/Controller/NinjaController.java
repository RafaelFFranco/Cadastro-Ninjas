package dev.java10x.CadastroDeNinjas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //declarar que é um controller
@RequestMapping
public class NinjaController {

    @GetMapping("/BemVindo") //Ação de Get
    public String boasVindas(){
        return "Boas Vindas";
    }

}
