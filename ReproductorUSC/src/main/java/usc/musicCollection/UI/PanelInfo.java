package usc.musicCollection.UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PanelInfo extends JPanel implements ActionListener {
    MainWindow miVentanaMadre;
    JTextArea txtLista;
    JTextField txtElemento;
    JButton btnCambiar;

    public PanelInfo(MainWindow ventanamadre){
        this.miVentanaMadre = ventanamadre;

        /*
        txtLista = new JTextArea();
        txtElemento = new JTextField();

        btnCambiar = new JButton("Cambiar");

        // Definir diagramacion antes de agregar los elementos
        this.setLayout(new GridLayout(3, 1));
        this.add(txtLista);
        this.add(txtElemento);
        this.add(btnCambiar);
    }
        */ // Esto era el original


        this.setLayout(null); // Configurar diseño nulo

        JLabel Artistas, Canciones;
        Artistas = new JLabel("Artistas", JLabel.CENTER);
        Artistas.setToolTipText("A label containing only text");
        Artistas.setBounds(100, 30, 200, 40); // No olvidar por q osino no sale
        this.add(Artistas);
        Canciones = new JLabel("Canciones", JLabel.CENTER);
        Canciones.setToolTipText("A label containing only text");
        Canciones.setBounds(100, 300, 200, 40);
        this.add(Canciones);


        // Crear los componentes
        txtLista = new JTextArea();
        txtElemento = new JTextField();
        btnCambiar = new JButton("Boton Cambiar");

        // Establecer tamaños y posiciones manualmente
        txtLista.setBounds(20, 70, 350, 150);    // x, y, ancho, alto
        txtElemento.setBounds(20, 230, 200, 30);
        btnCambiar.setBounds(230, 230, 140, 30);

        // Agregar el diseño nuevo
        this.add(txtLista);
        this.add(txtElemento);
        this.add(btnCambiar);

    }

        /*
        this.setLayout(new BorderLayout(10, 10)); // Espaciado entre paneles

        // txtLista en parte superior
        txtLista = new JTextArea();
        txtLista.setPreferredSize(new Dimension(300, 100)); // Sugerir tamaño
        this.add(new JScrollPane(txtLista), BorderLayout.NORTH); // ScrollPane para desplazar el texto

        // txtElemento y btnCambiar central con TextField y JButton
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Subpanel central
        txtElemento = new JTextField();
        txtElemento.setPreferredSize(new Dimension(200, 30)); // Ancho x Alto
        btnCambiar = new JButton("Boton Cambiar");
        btnCambiar.setPreferredSize(new Dimension(100, 30)); // Ancho x Alto

        centerPanel.add(txtElemento);
        centerPanel.add(btnCambiar);
        this.add(centerPanel, BorderLayout.CENTER);

        // Panel inferior
        JLabel footer = new JLabel("Holaaaa (Panel inferior)", SwingConstants.CENTER);
        footer.setPreferredSize(new Dimension(300, 20));
        this.add(footer, BorderLayout.SOUTH);
    }
     */ // Diseño 1
    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
