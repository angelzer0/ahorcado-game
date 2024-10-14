package org.example;

import org.example.constants.ConstantesTablero;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Tablero {

    List<String> palabras;
    Map<String, List<String>> pistas;

    int contadorPistas = 6;

    public void palabrasPorCategoria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el número de la categoría que prefieres:\n- 1. Animales\n- 2. Frutas\n- 3. Países\n- 4. Colores");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                palabras = ConstantesTablero.ANIMALES;
                pistas = ConstantesTablero.PISTAS_ANIMALES;
                break;
            case 2:
                palabras = ConstantesTablero.FRUTAS;
                pistas = ConstantesTablero.PISTAS_FRUTAS;
                break;
            case 3:
                palabras = ConstantesTablero.PAISES;
                pistas = ConstantesTablero.PISTAS_PAISES;
                break;
            case 4:
                palabras = ConstantesTablero.COLORES;
                pistas = ConstantesTablero.PISTAS_COLORES;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
    }

    public String palabraAleatoria(List<String> palabras) {
        return palabras.get(new java.util.Random().nextInt(palabras.size()));
    }

    public List<String> obtenerPistas(String palabraAleatoria) {
        return pistas.getOrDefault(palabraAleatoria, List.of());
    }

    public void quitarPuntos() {
        if (contadorPistas > 0) {
            contadorPistas--;
        }
        System.out.println("Te quedan " + contadorPistas + " pistas");
    }

    public boolean esPalabraCorrecta(String palabraAleatoria, String palabraElegida) {
        return palabraAleatoria.equalsIgnoreCase(palabraElegida);
    }

    public void iniciarAhorcado() {
        palabrasPorCategoria();
        String palabraSeleccionada = palabraAleatoria(palabras);
        List<String> pistas = obtenerPistas(palabraSeleccionada);
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < pistas.size(); i++) {
            String pista = pistas.get(i);
            System.out.println("La pista número " + (i + 1) + " es: " + pista);
            System.out.println("Introduce la palabra:");
            String palabraIngresada = sc.nextLine();

            if (esPalabraCorrecta(palabraSeleccionada, palabraIngresada)) {
                System.out.println("¡Correcto! La palabra era: " + palabraSeleccionada);
                sc.close();
                return;
            } else if (i < pistas.size() - 1) {
                System.out.println("Incorrecto, pasemos a la siguiente pista...");
            } else {
                System.out.println("Se han agotado todas las pistas. La palabra era: " + palabraSeleccionada);
            }
        }

        sc.close();
    }
}
