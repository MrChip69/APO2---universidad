package usc.musicCollection.UI;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Es la primera en ejecutarse.
// Crea la ventana principal (MainWindow) y la muestra al usuario.


public class Main {
    public static void main(String[] args) {
        MainWindow miVentanaPrincipal = new MainWindow();
        miVentanaPrincipal.setVisible(true);
    }
}


