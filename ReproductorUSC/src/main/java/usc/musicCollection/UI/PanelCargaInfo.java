package usc.musicCollection.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JLabel;

public class PanelCargaInfo  extends JPanel implements ActionListener {

    JButton botonCargaArchivo; // Nuevo Boton Cargar Archivo
    JButton botonguardar; // Nuevo Boton Guardar...




    public PanelCargaInfo() {

        this.setLayout(null); //diseño nulo

        JLabel label1;
        label1 = new JLabel("Listas de Reproduccion", JLabel.CENTER);
        label1.setToolTipText("A label containing only text");
        label1.setBounds(100, 30, 200, 40); // No olvidar por q osino no sale
        this.add(label1);

        botonCargaArchivo = new JButton("Cargar Archivo"); // Info Boton Cargar Archivo
        botonCargaArchivo.setBounds(140, 500, 150, 40); // x, y, ancho, alto
        botonCargaArchivo.addActionListener(this);
        botonCargaArchivo.setActionCommand("CARGAR");
        this.add(botonCargaArchivo);

        botonguardar = new JButton("Guardar"); // Info Boton Guardar...
        botonguardar.setBounds(20, 500, 100, 40); // x, y, ancho, alto
        botonguardar.addActionListener(this);
        botonguardar.setActionCommand("GUARDAR");
        this.add(botonguardar);


        //this.setLayout(new GridLayout(2,1));
        
    }


    public void guardarInfo(String ruta){
        
        String[]lineas = new String[]{"Algoritmos","Y", "Programacion 2", "2024B", "USC"};
        Scanner lectorConsola = new Scanner(System.in);

        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta));
            for(String l:lineas){
                escritor.write(l);
                //salto de linea:
                escritor.newLine();
            }
            escritor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * este método responde por los eventos de todos los elementos del
     * panel
     * @param e the event to be processed
     */




    @Override
    public void actionPerformed(ActionEvent e) { // aqui van las respuestas de los botones...
        String action = e.getActionCommand();
        switch (action){
            case "CargarArchivo":
                break;
            case "Guardar":
                guardarInfo("src/main/resources/nuevoArchivo.txt");
        }

        if(e.getSource() == botonCargaArchivo) { // Boton Cargar Archivo
            System.out.println("Se ha interactuado...  Boton Cargar");

        }

        else if(e.getSource() == botonguardar) { // Boton Guardar...
            if(e.getSource() == botonguardar) {
                System.out.println("Boton Guardaar...");

            }
        }

    }




}
