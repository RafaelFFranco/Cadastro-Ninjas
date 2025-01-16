package dev.java10x.CadastroDeNinjas.Ninja;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
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

    //Many referencia a classe da variavel e o one a classe que está inserida, então, muitos ninjas tem uma missão 1-N
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira da missao, (pk da missão)
    private MissaoModel missoes;


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
