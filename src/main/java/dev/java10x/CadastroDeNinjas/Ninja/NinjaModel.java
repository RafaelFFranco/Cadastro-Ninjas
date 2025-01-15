package dev.java10x.CadastroDeNinjas.Ninja;

import jakarta.persistence.*;

//JPA = java persistence API
@Entity // transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String aldeia;


    public NinjaModel() {}

    public NinjaModel(String aldeia, int idade, String nome) {
        this.aldeia = aldeia;
        this.idade = idade;
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
