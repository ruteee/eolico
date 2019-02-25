package com.eolicoproject.eolico.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Complexo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotNull
    @Column(length = 45)
    private String nome;

    @NotNull
    @Column(length = 45)
    private String uf;

    @NotNull
    @Column(length = 45)
    private String identificador;

    @OneToMany(mappedBy = "complexo", cascade = CascadeType.ALL)
    private List<Parque> parques;


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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public List<Parque> getParques() {
        return parques;
    }

    public void setParques(List<Parque> parques) {
        this.parques = parques;
    }
}
