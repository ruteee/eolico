package com.eolicoproject.eolico.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Aerogerador {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="parque_id")
    private Parque parque;

    @NotNull
    @Column(length = 45)
    private String nome;

    private Float latitude;
    private Float longitude;
    private Float alturaTorre;
    private Float diametroVarredura;

    @NotNull
    @Column(length = 45)
    private String modelo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getAlturaTorre() {
        return alturaTorre;
    }

    public void setAlturaTorre(Float alturaTorre) {
        this.alturaTorre = alturaTorre;
    }

    public Float getDiametroVarredura() {
        return diametroVarredura;
    }

    public void setDiametroVarredura(Float diametroVarredura) {
        this.diametroVarredura = diametroVarredura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Parque getParque() {
        return parque;
    }

    public void setParque(Parque parque) {
        this.parque = parque;
    }
}

