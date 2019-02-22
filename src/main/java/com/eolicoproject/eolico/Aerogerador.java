package com.eolicoproject.eolico;

import javax.persistence.*;

@Entity
public class Aerogerador {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="parque_id")
    private ParqueEolico  parqueEolico;

    private String nome;
    private Float latitude;
    private Float longitude;
    private Float alturaTorre;
    private Float diametroVarredura;
    private String modelo;

    public Aerogerador(ParqueEolico parqueEolico, String nome, Float latitude, Float longitude, Float alturaTorre, Float diametroVarredura, String modelo) {
        this.parqueEolico = parqueEolico;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alturaTorre = alturaTorre;
        this.diametroVarredura = diametroVarredura;
        this.modelo = modelo;
    }

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

    public ParqueEolico getParqueEolico() {
        return parqueEolico;
    }

    public void setParqueEolico(ParqueEolico parqueEolico) {
        this.parqueEolico = parqueEolico;
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
}

