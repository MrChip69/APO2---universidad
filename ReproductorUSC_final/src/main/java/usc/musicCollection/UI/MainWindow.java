package usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private MusicManager musicManager;

    public MainWindow() {
        this.setSize(800, 600);
        this.setTitle("MusicCollection");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar el gestor de música
        musicManager = new MusicManager();

        // Diseño de la ventana principal
        this.setLayout(new GridLayout(1, 3));
        this.add(new PanelPlaylist(musicManager));
        this.add(new PanelArtista(musicManager));
        this.add(new PanelCanciones(musicManager));
    }
}
