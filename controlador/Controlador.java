package controlador;

import modelo.Carro;
import modelo.Empleado;
import modelo.EmpresaAutomotriz;
import vista.PanelEntradaDatos;
import vista.PanelResultados;
import vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.text.View;

public class Controlador implements ActionListener {
    private VentanaPrincipal miVentanaPrincipal;
    private Carro miCarro;
    private ArrayList<Carro> carrosVendidos = new ArrayList<>();

    public Controlador(VentanaPrincipal miVentanaPrincipal, EmpresaAutomotriz modelo) {
        this.miVentanaPrincipal = miVentanaPrincipal;
        this.miVentanaPrincipal.miPanelOperaciones.bAgregar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bCalcular.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bBorrar.addActionListener(this);
        this.miVentanaPrincipal.miPanelOperaciones.bSalir.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        if (comando.equals("agregarunCarro")) {
            String nombre = PanelEntradaDatos.getEmpleado();
            int precio = Integer.parseInt(PanelEntradaDatos.getPrecio());
            int sueldo = Integer.parseInt(PanelEntradaDatos.getSueldo());
            miCarro = new Carro(precio);
            vista.PanelResultados.mostrarResultados("Se ha registrado una nueva venta!\n");
            carrosVendidos.add(miCarro);
        } else if (comando.equals("calcularSalario")) {
            Empleado.calcularSalario(carrosVendidos);

        } else if (comando.equals("borrarTexto")) {
            JOptionPane.showMessageDialog(null,"Los datos seran borrados ", "Suma 3 enteros ", JOptionPane.WARNING_MESSAGE);
            this.miVentanaPrincipal.miPanelEntradaDatos.borrarTa();
            this.miVentanaPrincipal.miPanelResultados.borrarTa();
        } else if (comando.equals("cerrarVentana")) {
            JOptionPane.showMessageDialog(null, "El programa se cerrará", "Venta de Carros",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}