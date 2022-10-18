package ejecutable;

import vista.VentanaPrincipal;
import controlador.Controlador;
import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;


public class Test
{
    private static EmpresaAutomotriz miEmpresaAutomotriz;

    public static void main(String[] args)

    {
        VentanaPrincipal miVentana = new VentanaPrincipal(); 
        new Controlador(miVentana, miEmpresaAutomotriz);
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();

        String[] nombres = {"Mafe", "Daniel", "Carlos", "Mauricio", "Juan", "Andrey", "Kevin", "Nicolas", "Sara", "Sebastian"};
        
        for(int i=0; i<nombres.length; i++)
        {
            miEmpresa.AgregarEmpleado(new Empleado (nombres[i]), i);
        }

        System.out.println("Nomina empresa: " + miEmpresa.calcularNomina());

        Empleado emp1 = miEmpresa.getEmpleado(0);

        emp1.venderCarro(new Carro( 150000000));
        emp1.venderCarro(new Carro( 50000000));
    }
}