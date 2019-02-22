package com.eolicoproject.eolico;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Aerogerador implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name="parque_id")
    private Parque parque;

    private String nome;
    private Float latitude;
    private Float longitude;
    private Float alturaTorre;
    private Float diametroVarredura;
    private String modelo;

    public Aerogerador(Parque parque, String nome, Float latitude, Float longitude, Float alturaTorre, Float diametroVarredura, String modelo) {
        this.parque = parque;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
        this.alturaTorre = alturaTorre;
        this.diametroVarredura = diametroVarredura;
        this.modelo = modelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Parque getParque() {
        return parque;
    }

    public void setParque(Parque parque) {
        this.parque = this.parque;
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
