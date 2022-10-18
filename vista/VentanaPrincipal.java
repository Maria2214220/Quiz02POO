package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    public VentanaPrincipal() {
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10, 10, 480, 180);

        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10, 200, 480, 80);

        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10, 290, 480, 110);

        this.setTitle("Venta de Carros");
        this.setSize(508, 442);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(null);
        this.add(miPanelEntradaDatos);
        this.add(miPanelOperaciones);
        this.add(miPanelResultados);
    }
}