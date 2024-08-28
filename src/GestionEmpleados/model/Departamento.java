package GestionEmpleados.model;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String codigo;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Departamento() {}

    public Departamento(String nombre, String codigo, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
