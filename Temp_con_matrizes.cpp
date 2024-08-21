// apo2
// dfloaiza@gmail.com
// dfloaizab - github
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
    const int FILAS = 101; //
    int t_conv[FILAS][3];//
    int opcion = -1;//
    float Ce, Fa, Ke;

    SetConsoleOutputCP(65001); //  Cambiar la página de códigos a UTF-8 para asi poder usar caracteres especiales
    
    //const wchar_t* titulo = L"Unidades de Temperatura con Matizes";// Convertir la cadena de caracteres normales a una cadena de caracteres anchos.
    //SetConsoleTitle(titulo); // Cambia el título de la Consola a uno personalizado.


    while (opcion != 0){
    Ce=0; Fa=0; Ke=0; //las iniciamos en ceros por si las moscas..
    limpiarConsola();  // Limpia la consola
    printf(" - CONVERSOR DE TEMPERATURAS - \n");
    
    for(int i=0 ; i<FILAS; i++){
        t_conv[i][0]=i; // °C
        t_conv[i][1]=t_conv[i][0]*(9.0 / 5) + 32; // °C a °F 
        t_conv[i][2]=t_conv[i][0]+273.15; // °C a °K
    }

    for (int i = 0; i < FILAS; i++) {
        printf(" %d °C -> %d °F -> %d °K \n"), t_conv[i][0] , t_conv[i][1], t_conv[i][2];
    }
    

    Sleep(2000);
    printf("Presione una tecla para continuar...\n");
    fflush(stdin); // Da una improvisada pausa al programa
    getchar();
    limpiarConsola();  // Limpia la consola

    } //cierra el while
    return 0;
}