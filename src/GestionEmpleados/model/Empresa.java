package GestionEmpleados.model;

import java.util.ArrayList;

public class Empresa {
    private static Empresa instance = null;

    ArrayList<Empleado> empleados = new ArrayList<>();
    ArrayList<Proyecto> proyectos = new ArrayList<>();
    ArrayList<Departamento> departamentos = new ArrayList<>();

    private Empresa() {}
    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new Empresa();
        }
    }

    public static Empresa getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void obtenerProyectoPersonaPorNombreProyecto(String nombreProyecto) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombreProyecto)) {
               for (Empleado empleado : empleados) {
                   if (empleado.getProyecto().equals(proyecto)) {
                       System.out.println(empleado.getNombre());
                   }
               }
            }
        }
    }
}
