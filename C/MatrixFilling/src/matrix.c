#include <stdio.h>

// Definición de la estructura para representar a un estudiante
struct Estudiante {
    char nombre[50];
    int edad;
    float promedio;
};

// Función para imprimir un mensaje de felicitación si el promedio es mayor a 4
void felicitarEstudiante(struct Estudiante estudiante) {
    if (estudiante.promedio > 4.0) {
        printf("¡Felicidades, %s! Tu desempeño es excelente.\n", estudiante.nombre);
    } else {
        printf("%s, tu promedio no es lo suficientemente alto para recibir una felicitación.\n", estudiante.nombre);
    }
}

int main() {
    // Definición de un arreglo de estudiantes para almacenar hasta 100 estudiantes
    struct Estudiante estudiantes[100];
    int numEstudiantes = 0;  // Contador de estudiantes registrados

    // Menú principal
    int opcion;
    do {
        printf("\n*** Sistema de Registro de Estudiantes ***\n");
        printf("1. Registrar Estudiante\n");
        printf("2. Consultar Estudiantes\n");
        printf("3. Salir\n");
        printf("Ingrese su opción: ");
        scanf("%d", &opcion);

        switch (opcion) {
            case 1:
                // Registro de estudiante
                printf("\nIngrese el nombre del estudiante: ");
                scanf("%s", estudiantes[numEstudiantes].nombre);
                printf("Ingrese la edad del estudiante: ");
                scanf("%d", &estudiantes[numEstudiantes].edad);
                printf("Ingrese el promedio del estudiante: ");
                scanf("%f", &estudiantes[numEstudiantes].promedio);
                numEstudiantes++;  // Incrementar el contador de estudiantes registrados
                break;
            case 2:
                // Consultar estudiantes y felicitar si el promedio es mayor a 4
                printf("\nEstudiantes Registrados:\n");
                for (int i = 0; i < numEstudiantes; i++) {
                    printf("Nombre: %s, Edad: %d, Promedio: %.2f\n",
                           estudiantes[i].nombre, estudiantes[i].edad, estudiantes[i].promedio);
                    felicitarEstudiante(estudiantes[i]);  // Llama a la función de felicitación
                }
                break;
            case 3:
                // Salir del programa
                printf("Saliendo del programa. ¡Hasta luego!\n");
                break;
            default:
                printf("Opción no válida. Por favor, ingrese una opción válida.\n");
        }
    } while (opcion != 3);

    return 0;
}
