package modelo;

import java.util.ArrayList;

public class EmpresaAutomotriz
{
    //----------------------
    // Constantes
    //----------------------
    public final static int NUMERO_EMPLEADOS = 3;

    //----------------------
    // Atributos
    //----------------------
    //private Empleado[] empleados;
    private ArrayList empleados;

    //----------------------
    // Metodos
    //----------------------
    public EmpresaAutomotriz()
    {
        //empleados = new Empleado[NUMERO_EMPLEADOS];
        empleados = new ArrayList();
    }

    /*public void agregarEmpleado(Empleado emp, int pos)
    {
        empleados[pos] = emp;
    }*/

    public void agregarEmpleado(Empleado emp)
    {
        empleados.add(emp);
    }

    /*public double calcularNomina()
    {
        double totalNomina = 0;
        for(int i=0; i<empleados.length; i++)
        {
            totalNomina = totalNomina + empleados[i].getSueldo();
        }
        return totalNomina;
    }*/

    public double calcularNomina()
    {
        double totalnomina = 0;
        for(int i=0; i<empleados.size();i++)
        {
            Empleado temp = (Empleado) empleados.get(i);
            totalnomina = totalnomina + temp.getSueldo();
        }
        return totalnomina;
    }

    public Empleado getEmpleado(int i)
    {
        return (Empleado) empleados.get(i);
    }

    public int getNumeroEmpleados()
    {
        return empleados.size();
    }
}