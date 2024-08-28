package GestionEmpleados.model;

public class Gerente extends Empleado implements IContribuyente {
    public Gerente() {}

    public Gerente(int idEmpleado, String nombre, Departamento departamento) {
        super(idEmpleado, nombre, departamento);
    }

    @Override
    public void contribuir(String contribucion) {
         System.out.println(contribucion);
    };
}
