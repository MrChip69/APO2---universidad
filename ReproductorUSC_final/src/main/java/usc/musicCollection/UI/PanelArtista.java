package usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;

public class PanelArtista extends JPanel {
    private MusicManager musicManager;

    public PanelArtista(MusicManager musicManager) {
        this.musicManager = musicManager;
        this.setLayout(new BorderLayout());

        JLabel title = new JLabel("Gestión de Artistas", SwingConstants.CENTER);
        this.add(title, BorderLayout.NORTH);

        JTextArea artistDisplay = new JTextArea();
        this.add(new JScrollPane(artistDisplay), BorderLayout.CENTER);

        JButton addButton = new JButton("Crear Artista");
        addButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(this, "Ingrese el nombre del artista:");
            if (name != null && !name.isEmpty()) {
                Artist artist = new Artist(name);
                musicManager.addArtist(artist);
                artistDisplay.append("Artista creado: " + name + "\n");
            }
        });

        this.add(addButton, BorderLayout.SOUTH);
    }
}

