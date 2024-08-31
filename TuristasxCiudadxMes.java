import java.util.Random;
import java.util.Scanner;
public class TuristasxCiudadxMes {
    public static void Turistas(int[] numeros){ // todo se almacena en un array tipo entero llamado numeros

        Random random = new Random(); 

        numeros[0] = 10 + random.nextInt(1001);// Cali
        numeros[1] = 10 + random.nextInt(1001);// Medellin
        numeros[2] = 10 + random.nextInt(1001);// Bogota
        numeros[3] = 10 + random.nextInt(1001);// Barranquilla

    }

    public static String perfeccion(int number) { // para hacer de la tabla resultante mucho mas estetica y entendible. pendiente...
        int intPart = (int) number;
        String perfect;

        if (intPart < 10) {// Agrega un espacio si tiene un digito en la parte entera
            perfect = " " + String.format("%.1f", number); 
        } else {// No agregar espacio si tiene mas de dos
            perfect = String.format("%.1f", number); 
        }

        return perfect;
    }// revisar funcionalidad antes de...

    public static void main(String[] args) throws InterruptedException {
        final int FILAS = 12;
        double[][] ciudad = new double[FILAS][4];
        int opcion = -1; 
        
        double mejormes = Double.NEGATIVE_INFINITY; // Inicializa con un valor muy bajo para encontrar el máximo
        int filaMaxima = -1; // Variable para almacenar el índice de la fila con el número más alto
        int seleciudad = -1;

        Scanner leer = new Scanner(System.in);

        System.out.println("Turistas por mes en ciudades principales");
        System.out.println("Cali - Medellin - Bogota - Barranquilla \n");
        for (int i=0; i<FILAS; i++ ){ //creacion de la tabla
            int[] numeros = new int[4]; // se invoca la array con las cifras generadas
            Turistas(numeros); // se hacen las operaciones
            ciudad[i][0] = numeros[0];
            ciudad[i][1] = numeros[1];
            ciudad[i][2] = numeros[2];
            ciudad[i][3] = numeros[3];
        }// fin ciclo for para crear tabla

        for(int i=0; i<FILAS; i++){ // imprimision tabla
            String mes;
            if (i == 0) {
                mes = "1. Enero     ";
            } else if (i == 1) {
                mes = "2. Febrero   ";
            } else if (i == 2) {
                mes = "3. Marzo     ";
            } else if (i == 3) {
                mes = "4. Abril     ";
            } else if (i == 4) {
                mes = "5. Mayo      ";
            } else if (i == 5) {
                mes = "6. Junio     ";
            } else if (i == 6) {
                mes = "7. Julio     ";
            } else if (i == 7) {
                mes = "8. Agosto    ";
            } else if (i == 8) {
                mes = "9. Septiembre";
            } else if (i == 9) {
                mes = "10.Octubre   ";
            } else if (i == 10) {
                mes = "11.Noviembre ";
            } else if (i == 11) {
                mes = "12.Diciembre ";
            } else {
                mes = "     ?    "; // en caso de que "i" no este entre 0 y 11
            }

            System.out.printf("%s | %d - %d - %d - %d \n", mes, (int)ciudad[i][0], (int)ciudad[i][1], (int)ciudad[i][2], (int)ciudad[i][3]); // no olvidar usar "perfeccion(ciudad[i][#],);" :P
        }

        boolean continuar = true;
        while(continuar){
            System.out.println("\n -  Menú de Opciones  - \n");
            
            System.out.println(" 1. Ciudad mas Visitada. \n 2. Mes con mayor llegada turistica. \n 0. Salir \n");
            System.out.println("**Digita solo un NUMERO de esta lista de acuerdo a su necesidad.** \n");
            opcion = leer.nextInt();
            if (opcion==1) {
                System.out.println("null 1");
                System.out.println("Pendiente por terminar...");

                int[] totalPorCiudad = new int[4]; // Array para almacenar el total de visitas para cada ciudad
                
                for (int i = 0; i < FILAS; i++) {// Sumar las visitas de cada ciudad x 12 meses
                    totalPorCiudad[0] += ciudad[i][0]; // Cali
                    totalPorCiudad[1] += ciudad[i][1]; // Medellín
                    totalPorCiudad[2] += ciudad[i][2]; // Bogotá
                    totalPorCiudad[3] += ciudad[i][3]; // Barranquilla
                }
                // Determinar cuál ciudad tiene el mayor número total de visitas
                int ciudadMaxima = 0; // Inicializar con el índice de la primera ciudad (Cali)
                int maxVisitas = totalPorCiudad[0]; // Inicializar con el total de visitas de la primera ciudad

                for (int i = 1; i < totalPorCiudad.length; i++) {
                    if (totalPorCiudad[i] > maxVisitas) {
                        maxVisitas = totalPorCiudad[i]; // Actualizar el máximo de visitas
                        ciudadMaxima = i; // Actualizar el índice de la ciudad más visitada
                    }
                }
                
                String nombreCiudad = "";// imprimir ciudad más visitada
                switch(ciudadMaxima) {
                    case 0: nombreCiudad = "Cali"; break;
                    case 1: nombreCiudad = "Medellín"; break;
                    case 2: nombreCiudad = "Bogotá"; break;
                    case 3: nombreCiudad = "Barranquilla"; break;
                }
                System.out.println("\nLa ciudad más visitada es: " + nombreCiudad + "\n Con un total de " + maxVisitas + " visitas. \n");

            }else if (opcion==2) {
                System.out.println("null 2");
                System.out.println("\n 1. para Cali - 2.Medellin - 3.Bogota - 4.Barranquilla \n");
                seleciudad = leer.nextInt();
                for(int i=0; i<FILAS; i++){ // Recorre todas las filas

                    if (ciudad[i][seleciudad - 1] > mejormes) { // Compara la columna seleccionada
                        mejormes = ciudad[i][seleciudad - 1];   // Almacena el nuevo valor más alto en mejormes
                        filaMaxima = i;           // Almacena el índice de la fila con el valor más alto
                    }
                }
                System.out.println("\n Mes mas visitado: " + (filaMaxima + 1)); // Mostrar el mes (filaMaxima + 1 para hacerlo humano)
                System.out.println("\n Con una cifra de: " + (int)mejormes); // Mostrar el valor sin decimales


            }else if(opcion==0){ continuar=false; } // se sale del bucle solo cuando "opcion" sea igual a 0

        } // fin bucle while



        System.out.println("\n end");

    }// fin main
                                               
}
