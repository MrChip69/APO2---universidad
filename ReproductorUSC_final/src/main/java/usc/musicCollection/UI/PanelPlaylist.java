package usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;

public class PanelPlaylist extends JPanel {
    private MusicManager musicManager;

    public PanelPlaylist(MusicManager musicManager) {
        this.musicManager = musicManager;
        this.setLayout(new BorderLayout());

        JLabel title = new JLabel("Gestión de Listas de Reproducción", SwingConstants.CENTER);
        this.add(title, BorderLayout.NORTH);

        JTextArea playlistDisplay = new JTextArea();
        this.add(new JScrollPane(playlistDisplay), BorderLayout.CENTER);

        JButton addButton = new JButton("Crear Lista");
        addButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(this, "Ingrese el nombre de la lista:");
            if (name != null && !name.isEmpty()) {
                Playlist playlist = new Playlist(name);
                musicManager.addPlaylist(playlist);
                playlistDisplay.append("Lista creada: " + name + "\n");
            }
        });

        this.add(addButton, BorderLayout.SOUTH);
    }
}
