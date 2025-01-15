package dev.java10x.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private RankMissaoEnum rank;

    public MissaoModel() {
    }

    public MissaoModel(Long id, RankMissaoEnum rank, String descricao) {
        this.id = id;
        this.rank = rank;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RankMissaoEnum getRank() {
        return rank;
    }

    public void setRank(RankMissaoEnum rank) {
        this.rank = rank;
    }
}
