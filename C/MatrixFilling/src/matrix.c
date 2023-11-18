#include <stdio.h>
#define N 4

// Función para inicializar todos los elementos de la matriz con ceros.
void limpiarMatriz(int matriz[N][N]){
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            matriz[i][j] = 0;
        }
    }
}

// Función para mostrar la matriz, formateando los números de un solo dígito.
void mostrarMatriz(int matriz[N][N]){
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            if (matriz[i][j] / 10 > 0) printf("%d ", matriz[i][j]);
            else printf(" %d ", matriz[i][j]);
        }
        printf("\n");
    }
}

int main(){
    FILE *archivo;
    char direccion[100];

    // Abre el archivo "input.txt" en modo lectura.
    archivo = fopen("input.txt", "r");

    // Verifica si hubo un error al abrir el archivo.
    if (archivo == NULL){
        perror("Error al abrir el archivo");
        return 1;
    }

    int i = 0, j = 0, k = 0, problems = 0, matriz[N][N] = {0};

    // Lee el archivo palabra por palabra (dirección en este caso).
    while (fscanf(archivo, "%s", direccion) == 1){  
        printf("%s\n", direccion);      

        // Asigna valores a la matriz dependiendo de la dirección leída.
        matriz[j][i] = k++;
        if (direccion[0] == 'r') i += 1;
        else if (direccion[0] == 'd') j += 1;
        else if (direccion[0] == 'l') i -= 1;
        else if (direccion[0] == 'u') j -= 1;

        // Muestra la dirección si es "#", y reinicia la matriz si hay más de un problema.
        if (direccion[0] == '#' && problems == 0){
            printf("%s\n\n", direccion);
            problems += 1;
        }else if (direccion[0] == '#'){
            mostrarMatriz(matriz);
            limpiarMatriz(matriz);
            i = 0, j = 0, k = 1;
            printf("\n\n%s\n\n", direccion);
        }
    }

    // Muestra la matriz al final del archivo.
    mostrarMatriz(matriz);  

    // Cierra el archivo.
    fclose(archivo);

    // Indica que el programa se ejecutó correctamente.
    return 0;
}