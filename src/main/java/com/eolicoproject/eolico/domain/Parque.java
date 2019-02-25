package com.eolicoproject.eolico.domain;

import com.eolicoproject.eolico.domain.Aerogerador;
import com.eolicoproject.eolico.domain.Complexo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Parque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private int latitude;
    private int longitude;
    private Float potenciaInstalada;


    @ManyToOne(fetch = FetchType.EAGER, optional = false,cascade = CascadeType.ALL)
    @JoinColumn(name="complexo_id")
    private Complexo complexo;

    @OneToMany(mappedBy = "parque", cascade = CascadeType.ALL)
    private List<Aerogerador> aerogeradores;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public Float getPotenciaInstalada() {
        return potenciaInstalada;
    }

    public void setPotenciaInstalada(Float potenciaInstalada) {
        this.potenciaInstalada = potenciaInstalada;
    }


    public Complexo getComplexo() {
        return complexo;
    }

    public void setComplexo(Complexo complexo) {
        this.complexo = complexo;
    }

    public List<Aerogerador> getAerogeradores() {
        return aerogeradores;
    }

    public void setAerogeradores(List<Aerogerador> aerogeradores) {
        this.aerogeradores = aerogeradores;
    }
}

