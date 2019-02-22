package com.eolicoproject.eolico;

import javax.persistence.*;
import java.util.List;

@Entity
public class Complexo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String uf;
    private String identificacao;

    @OneToMany(mappedBy = "complexo")
    private List<ParqueEolico> parques;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }
}
