package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbEmpleados;
    private JComboBox cbEmpleados;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbEmpleados = new JLabel("Empleados: ", JLabel.RIGHT);
        lbEmpleados.setBounds(0,90,100,20);
        this.add(lbEmpleados);

        //Crear y agregar combo lista Empleados
        cbEmpleados = new JComboBox();
        cbEmpleados.setBounds(100,90,260,20);
        this.add(cbEmpleados);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public String getEmpleado()
    {
        return (String) cbEmpleados.getSelectedItem();
    }

    public int getIndexEmpleado()
    {
        return cbEmpleados.getSelectedIndex();
    }

    public void setEmpleado(String emp)
    {
        cbEmpleados.addItem(emp);
    }
}