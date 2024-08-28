package GestionEmpleados.model;

public class Tecnico extends Empleado implements IContribuyente {
    public Tecnico() {};
    public Tecnico(int idEmpleado, String nombre, Departamento departamento){
        super(idEmpleado, nombre, departamento);
    }

    @Override
    public void contribuir(String contribucion) {
        System.out.println(contribucion);
    }
}
