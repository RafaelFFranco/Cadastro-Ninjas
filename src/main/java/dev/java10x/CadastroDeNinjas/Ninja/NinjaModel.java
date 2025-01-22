package dev.java10x.CadastroDeNinjas.Ninja;

import dev.java10x.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA = java persistence API
@Entity // transforma uma classe em uma entidade do banco de dados
@Table(name = "tb_ninjas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true) // única no banco de dados
    private String email;

    private int idade;
    private String aldeia;

    //Many referencia a classe da variavel e o one a classe que está inserida, então, muitos ninjas tem uma missão 1-N
    @ManyToOne
    @JoinColumn(name = "missoes_id") // chave estrangeira da missao, (pk da missão)
    private MissaoModel missoes;

}
