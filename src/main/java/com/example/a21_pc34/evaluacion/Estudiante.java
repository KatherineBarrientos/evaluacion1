package com.example.a21_pc34.evaluacion;


public class Estudiante {
    public String nombre;
    public String codigo;
    public String materia;
    public Double parcial1;
    public Double parcial2;
    public Double parcial3;
    public Double promedio;


    public Estudiante(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3, Double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.promedio = promedio;
    }
}
