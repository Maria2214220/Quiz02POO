package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btAgregarVendedor;
    private JButton btVenderCarro;
    private JButton btCalcularSueldo;
    private JButton btLiquidarNomina;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton AgregarVendedor
        btAgregarVendedor = new JButton("Agregar Vendedor");
        btAgregarVendedor.setBounds(10,20,170,20);
        btAgregarVendedor.setActionCommand("agregarVendedor");
        this.add(btAgregarVendedor);

        //Crear y agregar boton VenderCarro
        btVenderCarro = new JButton("Vender Carro");
        btVenderCarro.setBounds(10,50,170,20); 
        btVenderCarro.setActionCommand("venderCarro");
        this.add(btVenderCarro);

        //Crear y agregar boton CalcularSueldo
        btCalcularSueldo = new JButton("Calcular Sueldo");
        btCalcularSueldo.setBounds(10,80,170,20);
        btCalcularSueldo.setActionCommand("calcularSueldo");
        this.add(btCalcularSueldo);

        //Crear y agregar boton LiquidarNomina
        btLiquidarNomina = new JButton("Liquidar Nómina");
        btLiquidarNomina.setBounds(190,20,170,20); 
        btLiquidarNomina.setActionCommand("liquidarNomina");
        this.add(btLiquidarNomina);

        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btAgregarVendedor.addActionListener(pAL);
        btVenderCarro.addActionListener(pAL);
        btCalcularSueldo.addActionListener(pAL);
        btLiquidarNomina.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}