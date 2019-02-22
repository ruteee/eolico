package com.eolicoproject.eolico;

import javax.persistence.*;
import java.util.List;

@Entity
public class ParqueEolico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nome;
    private int latitude;
    private int longitude;
    private Float potenciaInstalada;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="complexo_id")
    private Complexo complexo;

    @OneToMany(mappedBy = "parqueEolico")
    private List<Aerogerador> aerogeradores;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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


}

