package ejecutable;

import controlador.Controlador;
import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        /*Consola
        
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();
        String[] nombres = {"Nestor Paez", "Lukas Herrera", "Jean Florez"};
        for(int i=0; i<nombres.length; i++)
        {
            miEmpresa.agregarEmpleado(new Empleado(nombres[i]), i);
        }
        System.out.println("Nomina empresa: " + miEmpresa.calcularNomina());
        Empleado emp1 = miEmpresa.getEmpleado(0);
        emp1.venderCarro(new Carro(150000000));
        emp1.venderCarro(new Carro(50000000)); 
        */

        VentanaPrincipal miVentana = new VentanaPrincipal();
        EmpresaAutomotriz miEmpresa = new EmpresaAutomotriz();
        Controlador miControlador = new Controlador(miVentana, miEmpresa);
    }    
}