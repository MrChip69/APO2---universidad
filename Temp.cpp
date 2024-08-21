// apo2
// dfloaiza@gmail.com
// tarea: matrices de temperaturas de 0 a 100

#include <stdio.h>
#include <windows.h>

void limpiarConsola() {
    HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);  // Obtiene el manejador de la consola
    COORD coordScreen = { 0, 0 };  // Coordenadas de inicio (0, 0)
    DWORD cCharsWritten;
    CONSOLE_SCREEN_BUFFER_INFO csbi;
    DWORD dwConSize;

    if (!GetConsoleScreenBufferInfo(hConsole, &csbi)) {  // Obtiene el tamaño del buffer de la consola
        return;
    }
    dwConSize = csbi.dwSize.X * csbi.dwSize.Y;

    if (!FillConsoleOutputCharacter(hConsole, (TCHAR)' ', dwConSize, coordScreen, &cCharsWritten)) {  // Llena el buffer de la consola con espacios en blanco
        return;
    }

    if (!FillConsoleOutputAttribute(hConsole, csbi.wAttributes, dwConSize, coordScreen, &cCharsWritten)) {  // Rellena los atributos de la consola (por ejemplo, color de texto y fondo)
        return;
    }

    SetConsoleCursorPosition(hConsole, coordScreen);  // Mueve el cursor a la posición superior izquierda
} // fin de codigo para limpiar la consola con solo la libreria windows.h

int main() {
    int opcion = -1;
    float Ce, Fa, Ke;
    SetConsoleOutputCP(65001); //  Cambiar la página de códigos a UTF-8 para asi poder usar caracteres especiales
    SetConsoleTitle("Conversor de Unidades de Temperatura v1  -  By: Andres C. 2024"); //  Cambia el titulo de la Consola a uno personalizado.
    while (opcion != 0){
    Ce=0; Fa=0; Ke=0; //las iniciamos en ceros por si las moscas..
    printf(" - CONVERSOR DE TEMPERATURAS - \n");
    printf("  Menú de Opciones: \n");
    printf(" \n");
    printf(" 1. °C  -->  °F \n");
    printf(" 2. °F  -->  °C \n");
    printf(" 3. °C  -->  °K \n");
    printf(" 4. °K  -->  °C \n");
    printf(" 0. SALIR \n");
    printf(" \n");
    printf("Por favor, digite solo una opción: ");
    
    scanf("%d", &opcion); // Usa %d para que lo lea como un entero
    limpiarConsola();  // Limpia la consola

    if (opcion == 4) {
        printf("Ha elegido °Kelvin  -->  °Celsius \n");
        Sleep(1000);
        printf("Digita el valor en Kelvin a convertir: \n");
        scanf("%f", &Ke);
        Ce = (Ke - 273.15);
        printf("El resultado es: %.2f °C \n", Ce); // Usa %.2f para mostrar el valor con 2 decimales
    } else if (opcion == 3) {
        printf("Ha elegido °Celsius --> °Kelvin \n");
        Sleep(1000);
        printf("Digita el valor en Celsius a convertir: \n");
        scanf("%f", &Ce);
        Ke = (Ce + 273.15);
        printf("El resultado es: %.2f °K \n", Ke);
    } else if (opcion == 2) {
        printf("Ha elegido °Farenheit --> °Celcius \n");
        Sleep(1000);
        printf("Digita el valor en Fahrenheit a convertir: \n");
        scanf("%f", &Fa);
        Ce = ((Fa - 32) * 5 / 9);
        printf("El resultado es: %.2f °C \n", Ce);
    } else if (opcion == 1) {
        printf("Ha elegido °Celsius --> °Fahrenheit \n");
        Sleep(1000);
        printf("Digita el valor en Celsius a convertir: \n");
        scanf("%f", &Ce);
        Fa = ((Ce * 9 / 5) + 32);
        printf("El resultado es: %.2f °F\n", Fa);
    } else if (opcion == 0){
        printf("Good Bye!! ;D \n");
        Sleep(1000);
    } else {
        printf("Opcion no valida.\n");
        Sleep(2000);
    }

    printf("Presione una tecla para continuar...\n");
    fflush(stdin); // Da una improvisada pausa al programa
    getchar();
    limpiarConsola();  // Limpia la consola

    } //cierra el while
    return 0;
}



