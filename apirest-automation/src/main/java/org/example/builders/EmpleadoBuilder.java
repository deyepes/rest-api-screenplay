package org.example.builders;

import org.example.models.Empleado;

public class EmpleadoBuilder implements Builder<Empleado> {

    private String nombre;
    private String salario;
    private String edad;

    public EmpleadoBuilder() {
        this.nombre ="";
        this.salario="";
        this.edad="";
    }

    @Override
    public Empleado build() {
        return new Empleado(nombre,salario,edad);
    }

    public EmpleadoBuilder conNombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    public EmpleadoBuilder conSalario(String salario) {
        this.salario=salario;
        return this;
    }

    public Empleado yConEdad(String edad) {
        this.edad=edad;
        return build();
    }
}
