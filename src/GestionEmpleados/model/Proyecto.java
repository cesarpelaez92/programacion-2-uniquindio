package GestionEmpleados.model;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private String codigo;
    private ArrayList<Empleado> empleadosAsignados;
    public static Proyecto instance = null;

    public Proyecto() {}

    public Proyecto(String nombre, String codigo, ArrayList<Empleado> empleadosAsignados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.empleadosAsignados = empleadosAsignados;
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new Proyecto();
        }
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

    public ArrayList<Empleado> getEmpleadosAsignados() {
        return empleadosAsignados;
    }

    public void setEmpleadosAsignados(ArrayList<Empleado> empleadosAsignados) {
        this.empleadosAsignados = empleadosAsignados;
    }
}
