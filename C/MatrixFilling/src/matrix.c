#include <stdio.h>
#define N 4
void limpiarMatriz(int matriz[N][N]){
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            matriz[i][j] = 0;
        }
    }
}
void mostrarMatriz(int matriz[N][N]){
    for (int i = 0; i < N; i++){
        for (int j = 0; j < N; j++){
            if (matriz[i][j] / 10 > 0)printf("%d ", matriz[i][j]);
            else printf(" %d ", matriz[i][j]);
        }
        printf("\n");
    }
}
int main(){
    FILE *archivo;
    char direccion[100];
    archivo = fopen("input.txt", "r");
    if (archivo == NULL){
        perror("Error al abrir el archivo");
        return 1;
    }
    int i = 0, j = 0, k = 0, problems = 0, matriz[N][N] = {0};
    while (fscanf(archivo, "%s", direccion) == 1){  
        printf("%s\n", direccion);      
        matriz[j][i] = k++;
        if (direccion[0] == 'r') i += 1;
        else if (direccion[0] == 'd') j += 1;
        else if (direccion[0] == 'l') i -= 1;
        else if (direccion[0] == 'u') j -= 1;
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
    mostrarMatriz(matriz);  
    fclose(archivo);
    return 0;
}