package Java_ProgramaBasico_04;

//Aquí van las clses de toda la relación 1

import java.util.Scanner;

class Ejercicios {
    public static void actividad1(){

    }

    public static void actividad2() {

    }

    public static void actividad3() {
    }

    public static void actividad4() {
    }

    public static void actividad5() {
    }

    public static void actividad6() {
    }

    public static void actividad7() {
    }

    public static void actividad8() {
    }

    public static void actividad9() {
    }

    public static double actividad10(double megaByte) {
        return megaByte * 1000;
    }

    public static double actividad11(double kiloByte) {
        return kiloByte / 1000;
    }

    public static void actividad12() {
    }

    public static void actividad13() {
    }

    public static void actividad14() {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int intentos = 5;
        boolean adivinado = false;

        System.out.println("Piensa en un número entre 0 y 100. Intentaré adivinarlo en 5 intentos.");

        for (int i = 1; i <= intentos && !adivinado; i++) {
            int guess = (min + max) / 2;
            System.out.println("Intento " + i + ": ¿Es " + guess + "? (Responde: 'mayor', 'menor', 'igual')");
            String respuesta = sc.nextLine();

            if (respuesta.equalsIgnoreCase("igual")) {
                System.out.println("¡He adivinado! Tu número es " + guess);
                adivinado = true;  // Cambia el estado a "adivinado"
            } else if (respuesta.equalsIgnoreCase("mayor")) {
                min = guess + 1;  // Ajusta el límite inferior
            } else if (respuesta.equalsIgnoreCase("menor")) {
                max = guess - 1;  // Ajusta el límite superior
            }

            if (i == intentos && !adivinado) {
                System.out.println("¡Se acabaron los intentos! No pude adivinar tu número.");
            }
        }

        sc.close();

    }

    public static void actividad15() {
        // Definir las notas
        String[] notas = {"do", "re", "mi", "fa", "sol", "la", "si"};

        // Generar un número aleatorio de notas (múltiplo de 4 entre 4 y 28)
        int numNotas = (int) (Math.random() * 7 + 1) * 4; // Posibles valores: 4, 8, 12, ..., 28

        // Inicializar la melodía como una cadena vacía
        String melodia = "";

        // Elegir la primera nota
        String primeraNota = notas[(int) (Math.random() * notas.length)];
        melodia += primeraNota + " "; // Concatenar la primera nota

        // Generar las notas restantes
        for (int i = 1; i < numNotas - 1; i++) {
            if (i % 4 == 0) {
                melodia += "| "; // Separar compases con "|"
            }
            melodia += notas[(int) (Math.random() * notas.length)] + " "; // Concatenar la nota
        }

        // Añadir la última nota, que debe ser la misma que la primera
        if ((numNotas - 1) % 4 == 0) {
            melodia += "| "; // Añadir el separador de compás
        }
        melodia += primeraNota + " ||"; // Finalizar la melodía con "||"

        // Mostrar la melodía generada
        System.out.println(melodia);

    }

    public static void actividad16() {
    }

    public static void actividad17() {
    }

    public static void actividad18() {
    }

    public static void actividad19() {
    }

    public static void actividad20() {
    }

    public static void actividad21() {
    }
}

public class Main_04 {
    public static void main(String[] args) {
        Ejercicios.actividad1();
        Ejercicios.actividad2();
        Ejercicios.actividad3();
        Ejercicios.actividad4();
        Ejercicios.actividad5();
        Ejercicios.actividad6();
        Ejercicios.actividad7();
        Ejercicios.actividad8();
        Ejercicios.actividad9();
        Ejercicios.actividad10(1.0);
        Ejercicios.actividad11(1000.0);
        Ejercicios.actividad12();
        Ejercicios.actividad13();
        Ejercicios.actividad14();
        Ejercicios.actividad15();
        Ejercicios.actividad16();
        Ejercicios.actividad17();
        Ejercicios.actividad18();
        Ejercicios.actividad19();
        Ejercicios.actividad20();
        Ejercicios.actividad21();
    }
}