package usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;

public class PanelCanciones extends JPanel {
    private MusicManager musicManager;

    public PanelCanciones(MusicManager musicManager) {
        this.musicManager = musicManager;
        this.setLayout(new BorderLayout());

        JLabel title = new JLabel("Gestión de Canciones", SwingConstants.CENTER);
        this.add(title, BorderLayout.NORTH);

        JTextArea songDisplay = new JTextArea();
        this.add(new JScrollPane(songDisplay), BorderLayout.CENTER);

        JButton addButton = new JButton("Crear Canción");
        addButton.addActionListener(e -> {
            String titleInput = JOptionPane.showInputDialog(this, "Ingrese el título de la canción:");
            if (titleInput != null && !titleInput.isEmpty()) {
                String artistName = JOptionPane.showInputDialog(this, "Ingrese el nombre del artista:");
                Artist artist = new Artist(artistName);
                Song song = new Song(titleInput, artist);
                musicManager.addSong(song);
                songDisplay.append("Canción creada: " + titleInput + " (Artista: " + artistName + ")\n");
            }
        });

        this.add(addButton, BorderLayout.SOUTH);
    }
}

