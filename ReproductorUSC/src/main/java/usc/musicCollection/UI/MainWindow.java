package usc.musicCollection.UI;

import java.awt.*;

public class MainWindow  extends javax.swing.JFrame {

    PanelCargaInfo cargarArchivo;
    PanelInfo panelInfo;

    public MainWindow() { // metodo constructor que establece las propiedades de la ventana.
        this.setSize(800, 600);
        this.setTitle("MusicCollection");


        // Diagramacion de la ventana principal

        this.setLayout(new GridLayout(1, 2));

        this.add(new PanelCargaInfo());
        this.add(new PanelInfo(this));
    }
}
