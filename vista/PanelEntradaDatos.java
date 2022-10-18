package vista;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

public class PanelEntradaDatos extends JPanel {
    private JLabel lbTitulo;
    private JLabel lbEmp;
    private JLabel lbSueldo;
    private JLabel lbPrecio;
    private JLabel lbLogo;
    private ImageIcon iLogo;
    private static JTextField tfEmp;
    private static JTextField tfSueldo;
    private static JTextField tfPrecio;

    public PanelEntradaDatos() {
        lbTitulo = new JLabel("VENTA DE CARROS", SwingConstants.CENTER);
        lbTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLACK);
        lbTitulo.setBounds(10, 10, 480, 30);

        lbEmp = new JLabel("Emp=");
        lbEmp.setFont(new Font("Serif", Font.PLAIN, 18));
        lbEmp.setForeground(Color.BLACK);
        lbEmp.setBounds(240, 55, 480, 30);

        tfEmp = new JTextField();
        tfEmp.setFont(new Font("Arial", Font.PLAIN, 18));
        tfEmp.setForeground(Color.BLACK);
        tfEmp.setBounds(280, 55, 190, 30);;

        lbPrecio = new JLabel("$=");
        lbPrecio.setFont(new Font("Serif", Font.PLAIN, 18));
        lbPrecio.setForeground(Color.BLACK);
        lbPrecio.setBounds(240, 95, 480, 30);

        tfPrecio = new JTextField();
        tfPrecio.setFont(new Font("Arial", Font.PLAIN, 18));
        tfPrecio.setForeground(Color.BLACK);
        tfPrecio.setBounds(280, 95, 190, 30);

        lbSueldo = new JLabel("Suel=");
        lbSueldo.setFont(new Font("Serif", Font.PLAIN, 18));
        lbSueldo.setForeground(Color.BLACK);
        lbSueldo.setBounds(240, 135, 480, 30);

        tfSueldo = new JTextField();
        tfSueldo.setFont(new Font("Arial", Font.PLAIN, 18));
        tfSueldo.setForeground(Color.BLACK);
        tfSueldo.setBounds(280, 135, 190, 30);


        iLogo = new ImageIcon("automotriz.png");

        lbLogo = new JLabel(iLogo);
        lbLogo.setOpaque(true);
        lbLogo.setBorder(BorderFactory.createRaisedBevelBorder());
        lbLogo.setBounds(20, 60, 192, 96);

        this.setLayout(null);
        this.setBackground(Color.decode("#D9FF1C"));
        this.setVisible(true);
        this.add(lbTitulo);
        this.add(lbEmp);
        this.add(tfEmp);
        this.add(lbPrecio);
        this.add(tfPrecio);
        this.add(lbSueldo);
        this.add(tfSueldo);
    }
        //Metodos de acceso a la información de las cajas de texto
    public static String getEmpleado()
    {
        return tfEmp.getText();
    }

    public static String getSueldo()
    {
        return tfSueldo.getText();
    }

    public static String getPrecio()
    {
        return tfPrecio.getText();
    }
  
    public static void borrarTf() {
        JOptionPane.showMessageDialog(null, "Los datos serán borrados...", "Venta de Carros",
                JOptionPane.WARNING_MESSAGE);
        tfEmp.setText("");
        tfSueldo.setText("");
        tfPrecio.setText("");
        PanelResultados.taResultados.setText("");
    }
    public void borrarTa() {
    }
}