package vista;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class PanelOperaciones extends JPanel {
    public JButton bAgregar;
    public JButton bCalcular;
    public JButton bBorrar;
    public JButton bSalir;

    public PanelOperaciones() {
        bAgregar = new JButton("Agregar");
        bAgregar.setFont(new Font("Arial", Font.PLAIN, 14));
        bAgregar.setForeground(Color.BLACK);
        bAgregar.setBackground(Color.WHITE);
        bAgregar.setBorder(BorderFactory.createRaisedBevelBorder());
        bAgregar.setBounds(18, 22, 95, 40);
        bAgregar.setActionCommand("agregarCarro");

        bCalcular = new JButton("Calcular");
        bCalcular.setFont(new Font("Arial", Font.PLAIN, 14));
        bCalcular.setForeground(Color.BLACK);
        bCalcular.setBackground(Color.WHITE);
        bCalcular.setBorder(BorderFactory.createRaisedBevelBorder());
        bCalcular.setBounds(118, 22, 95, 40);
        bCalcular.setActionCommand("calcularSalario");

        bBorrar = new JButton("Borrar");
        bBorrar.setFont(new Font("Arial", Font.PLAIN, 14));
        bBorrar.setForeground(Color.BLACK);
        bBorrar.setBackground(Color.WHITE);
        bBorrar.setBorder(BorderFactory.createRaisedBevelBorder());
        bBorrar.setBounds(253, 22, 95, 40);
        bBorrar.setActionCommand("borrarTexto");

        bSalir = new JButton("Salir");
        bSalir.setFont(new Font("Arial", Font.PLAIN, 14));
        bSalir.setForeground(Color.BLACK);
        bSalir.setBackground(Color.WHITE);
        bSalir.setBorder(BorderFactory.createRaisedBevelBorder());
        bSalir.setBounds(370, 22, 95, 40);
        bSalir.setActionCommand("cerrarVentana");

        this.setLayout(null);
        this.setBackground(Color.decode("#0037FF"));
        this.setVisible(true);
        this.add(bAgregar);
        this.add(bCalcular);
        this.add(bBorrar);
        this.add(bSalir);
    }
}