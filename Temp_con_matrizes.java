import java.util.Scanner;

public class Temp_con_matrizes {

    public static void limpiarConsola() {
        // No hay una manera estándar de limpiar la consola en Java.
        // Puedes usar un bucle para imprimir líneas en blanco.
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int FILAS = 101;
        int[][] t_conv = new int[FILAS][3];
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 0) {
            limpiarConsola();  // Limpia la consola antes de imprimir el título
            System.out.println(" - CONVERSOR DE TEMPERATURAS - \n");

            for (int i = 0; i < FILAS; i++) {
                t_conv[i][0] = i; // °C
                t_conv[i][1] = (int)(t_conv[i][0] * (9.0 / 5) + 32); // °C a °F 
                t_conv[i][2] = (int)(t_conv[i][0] + 273.15); // °C a °K
            }

            for (int i = 0; i < FILAS; i++) {
                System.out.printf("%d °C -> %d °F -> %d °K \n", t_conv[i][0], t_conv[i][1], t_conv[i][2]);
            }

            Thread.sleep(2000);
            System.out.println("Presione una tecla para continuar...");
            scanner.nextLine();  // Espera la entrada del usuario
            limpiarConsola();
        }
    }
}
