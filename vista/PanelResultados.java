package vista;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Font;

public class PanelResultados extends JPanel {
    public static JTextArea taResultados;
    public static JScrollPane spResultados;

    public PanelResultados() {
        taResultados = new JTextArea();
        taResultados.setFont(new Font("Consolas", Font.PLAIN, 16));
        taResultados.setForeground(Color.BLACK);
        taResultados.setBorder(BorderFactory.createLoweredBevelBorder());
        taResultados.setEditable(false);
        taResultados.setBounds(9, 15, 460, 80);

        spResultados = new JScrollPane(taResultados);
        spResultados.setBounds(9, 15, 460, 80);

        this.setLayout(null);
        this.setBackground(Color.decode("#FF0000"));
        this.setVisible(true);
        this.add(spResultados);
    }

    public static void mostrarResultados(String texto) {
        taResultados.append(texto);
    }

    public void borrarTa() {
        taResultados.setText("");
    }
}