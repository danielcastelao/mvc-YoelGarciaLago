package com.cod.mvc.Model;
//
public class Coche {

    private String matricula;
    private String modelo;
    private Integer velocidad;

    public Coche(String matricula, String modelo, Integer velocidad) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
