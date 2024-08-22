import java.util.Scanner;
import java.util.Random;
public class TablaTemp {


    public static void Temps(double[] temperaturas){

        Random random = new Random(); 
                                                    // Bogota
        double randomDouble = random.nextDouble();  // Generar un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo)
        temperaturas[0] = 6 + (randomDouble * 20);  // Escalar y desplazar al rango [6.0, 26.0)
        temperaturas[0] = Math.round(temperaturas[0] * 10.0) / 10.0; // Redondear a un decimal

        randomDouble = random.nextDouble();          // Cali
        temperaturas[1] = 15 + (randomDouble * 27); 
        temperaturas[1] = Math.round(temperaturas[1] * 10.0) / 10.0;

        randomDouble = random.nextDouble();          // Medellin
        temperaturas[2] = 10 + (randomDouble * 24); 
        temperaturas[2] = Math.round(temperaturas[2] * 10.0) / 10.0;

        randomDouble = random.nextDouble();          // Pasto
        temperaturas[3] = 6 + (randomDouble * 18); 
        temperaturas[3] = Math.round(temperaturas[3] * 10.0) / 10.0;

        randomDouble = random.nextDouble();          // Barranquilla
        temperaturas[4] = 21 + (randomDouble * 19); 
        temperaturas[4] = Math.round(temperaturas[4] * 10.0) / 10.0;

        randomDouble = random.nextDouble();         // Manizales
        temperaturas[5] = 10 + (randomDouble * 23); 
        temperaturas[5] = Math.round(temperaturas[5] * 10.0) / 10.0;

    }
    public static String perfeccion(double number) { // para hacer de la tabla resultante mucho mas estetica y entendible
        int intPart = (int) number;
        String perfect;

        if (intPart < 10) {
            perfect = " " + String.format("%.1f", number); // Agrega un espacio si tiene un digito en la parte entera
        } else {
            perfect = String.format("%.1f", number); // No agregar espacio si tiene dos
        }

        return perfect;
    }

    public static void main(String[] args) throws InterruptedException {
        final int FILAS = 102;
        double[][] ciudad = new double[FILAS][6];
        Scanner scanner = new Scanner(System.in);

        System.out.println(" - Temperaturas Aleatorias por Ciudad - \n");
        System.out.printf("\n┌────────────────────────────────────────────────────────────────────┐\n");
        System.out.printf("│ Bogota  │  Cali   │ Medellin │  Pasto  │ Barranquilla  │ Manizales │\n");
        for(int i=0; i<FILAS; i++){

            double[] temperaturas=new double[6]; // array q contiene las temperaturas de todas las ciudades

            Temps(temperaturas); // Se realizan las operaciones aleatorias para luego cargarlo a las variables

            ciudad[i][0] = temperaturas[0]; // Temperaturas         Bogota
            ciudad[i][1] = temperaturas[1]; // Temperaturas           Cali
            ciudad[i][2] = temperaturas[2]; // Temperaturas       Medellin
            ciudad[i][3] = temperaturas[3]; // Temperaturas          Pasto
            ciudad[i][4] = temperaturas[4]; // Temperaturas   Barranquilla
            ciudad[i][5] = temperaturas[5]; // Temperaturas      Manizales
        }
        for (int i = 0; i < FILAS; i++) {   // imprime la tabla...
            System.out.println("├─────────│─────────│──────────│─────────│───────────────│───────────┤");
            System.out.printf("│ %s °C │ %s °C │  %s °C │ %s °C │    %s °C    │  %s °C  │\n", perfeccion(ciudad[i][0]), perfeccion(ciudad[i][1]), perfeccion(ciudad[i][2]), perfeccion(ciudad[i][3]), perfeccion(ciudad[i][4]), perfeccion(ciudad[i][5]) );
        }
        System.out.println("└─────────┴─────────┴──────────┴─────────┴───────────────┴───────────┘");

        System.out.println("Presione una tecla para continuar...");
        scanner.nextLine();  // Espera la entrada del usuario
    }
}