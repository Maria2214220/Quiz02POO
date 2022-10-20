package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class DialogoAgregarVendedor extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreVendedor;
    private JTextField tfNombreVendedor;
    private JButton btAgregarVendedor;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarVendedor()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreVendedor = new JLabel("Vendedor: ");
        lbNombreVendedor.setBounds(10,50,140,20);
        this.add(lbNombreVendedor);

        tfNombreVendedor = new JTextField();
        tfNombreVendedor.setBounds(150,50,100, 25);
        this.add(tfNombreVendedor);

        btAgregarVendedor = new JButton("Agregar");
        btAgregarVendedor.setBounds(20,140,260,25);
        btAgregarVendedor.setActionCommand("agregar");
        this.add(btAgregarVendedor);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Vendedor");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreVendedor()
    {
        return tfNombreVendedor.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarVendedor.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}