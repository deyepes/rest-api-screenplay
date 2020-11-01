package org.example.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Empleado implements Json {

    @SerializedName("name")
    @Expose
    private String nombre;
    @SerializedName("salary")
    @Expose
    private String salario;
    @SerializedName("age")
    @Expose
    private String edad;

    public Empleado(String nombre, String salario, String edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
