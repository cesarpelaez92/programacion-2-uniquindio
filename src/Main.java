import GestionEmpleados.model.*;

public class Main {
    public static void main(String[] args) {
        createData();
        Empresa empresa = Empresa.getInstance();
        empresa.obtenerProyectoPersonaPorNombreProyecto("");
    }

    public static void createData (){
        Empresa empresa = Empresa.getInstance();
        Departamento departamento = new Departamento();
        Departamento departamento2 = new Departamento();

        Tecnico tecnico = new Tecnico(1094926255, "Andres", departamento2);
        Tecnico tecnico1 = new Tecnico(1094926244, "Cesar", departamento);
        Tecnico tecnico2 = new Tecnico(1094926277, "Andrea", departamento);
        Tecnico tecnico3 = new Tecnico(1094926288, "Viviana", departamento);
        Tecnico tecnico4 = new Tecnico(1094926299, "Luisa", departamento2);

        Gerente gerente = new Gerente(1094923567, "Juan Carlos", departamento);
        Gerente gerente2 = new Gerente(1096797090, "Miguel Angel", departamento2);


        departamento.setNombre("TECH");
        departamento.setCodigo("TECH");
        departamento.getEmpleados().add(gerente);
        departamento.getEmpleados().add(tecnico1);
        departamento.getEmpleados().add(tecnico2);
        departamento.getEmpleados().add(tecnico3);

        departamento2.setNombre("CONTABILIDAD");
        departamento2.setCodigo("CONTABILIDAD");
        departamento2.getEmpleados().add(gerente2);
        departamento2.getEmpleados().add(tecnico);
        departamento2.getEmpleados().add(tecnico4);

        Proyecto proyecto = new Proyecto("SOFTWARE LIBRE", "SOFTL", departamento.getEmpleados());
        Proyecto proyecto2 = new Proyecto("CONTABLES", "CONTABLES", departamento2.getEmpleados());

        empresa.getEmpleados().add(gerente);
        empresa.getEmpleados().add(gerente2);
        empresa.getEmpleados().add(tecnico);
        empresa.getEmpleados().add(tecnico2);
        empresa.getEmpleados().add(tecnico3);
        empresa.getEmpleados().add(tecnico4);
        empresa.getEmpleados().add(tecnico1);

        empresa.getProyectos().add(proyecto);
        empresa.getProyectos().add(proyecto2);

        empresa.getDepartamentos().add(departamento);
        empresa.getDepartamentos().add(departamento2);

        tecnico1.setProyecto(proyecto);
        tecnico2.setProyecto(proyecto);
        tecnico3.setProyecto(proyecto);

        tecnico.setProyecto(proyecto2);
        tecnico4.setProyecto(proyecto2);

        gerente.setProyecto(proyecto);
        gerente2.setProyecto(proyecto2);
    }
}