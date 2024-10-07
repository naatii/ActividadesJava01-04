package Java_ProgramaBasico_04;

import java.util.List;
import java.util.Random;

class EjerciciosAleatorios {
    public int[] ejercicio1() {
        Random random = new Random();
        int[] dados = new int[3];

        // Generar 3 números aleatorios entre 1 y 6 (inclusive)
        for (int i = 0; i < 3; i++) {
            dados[i] = random.nextInt(6) + 1;
        }

        return dados;
    }

    public String ejercicio2() {
        Random random = new Random();
        // Posibles valores para los números de las cartas
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // Posibles palos de las cartas
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};

        // Seleccionar un valor y un palo al azar
        String valor = valores[random.nextInt(valores.length)];
        String palo = palos[random.nextInt(palos.length)];

        return valor + " de " + palo;
    }

    public static String ejercicio3() {
        return null;
    }

    public static List<Integer> ejercicio4() {
        return null;
    }

    public static int[] ejercicio5() {
        return null;
    }

    public static boolean ejercicio6(int[] intentos) {
        return false;
    }

    public static String[][] ejercicio7() {
        return null;
    }

    public static String[][] ejercicio8() {
        return null;
    }

    public static List<Integer> ejercicio9() {
        return null;
    }

    public static List<String> ejercicio10() {

        return List.of();
    }

    public static String[] ejercicio11() {

        return new String[0];
    }

    public static char[] ejercicio12(int cantidad) {
        return null;
    }

    public static List<int[]> ejercicio13() {
        return null;
    }

    public static int[] ejercicio14(boolean[] mayorMenor) {
        return null;
    }

    public static String ejercicio15() {
        return null;
    }

    public static void ejercicio16() {
    }

    public static void ejercicio17() {
    }

    public static void ejercicio18() {
    }

    public static void ejercicio19() {
    }

    public static void ejercicio20() {
    }

    public static void ejercicio21() {
    }
}
