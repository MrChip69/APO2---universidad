import java.util.Scanner;
public class Calculator {

    
    public static int suma(int a, int b){
        int s = a + b;
        return s;
    }
    public static int resta(int a, int b){
        int r = a - b;
        return r;
    }
    public static int multiplicacion(int a, int b){
        int m = a * b;
        return m;
    }
    public static int division(int a, int b){
        int d = a / b;
        return d;
    }
    public static void main(String[] args){
        int v1, v2, res;
        String op;
        Scanner leer = new Scanner(System.in);
        System.out.printf("Hello World");
        System.out.println("\n - Calculadora v1 - ");
        System.out.printf("\n Menú: ");
        System.out.printf("Digite segun su necesidad: \nSuma: - s -  \nResta: - r -  \nMultiplicación: - m - \nDivisión: - d - \n");
        op = leer.next();
        System.out.printf("Digita Valor Numerico 1: \n");
        v1 = leer.nextInt();
        System.out.printf("Digita Valor Numerico 2: \n");
        v2 = leer.nextInt();
        

        switch (op) {
            case "s", "S":
                res = suma(v1, v2);
                break;
            case "r", "R":
                res = resta(v1, v2);
                break;
            case "m", "M":
                res = multiplicacion(v1, v2);
                break;
            case "d", "D":
                res = division(v1, v2);
                break;
            default:
                System.out.println("ERROR");
                return;
        }
        System.out.printf("\n Tu Resultado es: " + res);

    } 

}