package Java_ProgramaBasico_03;

import java.util.ArrayList;
import java.util.List;

class EjerciciosBucles {
    public static List<Integer> ejercicio1() {
        return null;
    }

    public static List<Integer> ejercicio2() {
        return null;

    }

    public static List<Integer> ejercicio3() {
        return null;
    }

    public static List<Integer> ejercicio4() {
        List<Integer> lista = new ArrayList<>();
        for (int i = 320; i >= 160; i -= 20){
            System.out.println(i);
            lista.add(i);
        }
        return  lista;
    }

    public static List<Integer> ejercicio5() {
        List<Integer> lista = new ArrayList<>();
        int numero =320;
        while (numero >= 160){
            System.out.println(numero);
            lista.add(numero);
            numero -= 20;
        }
        return lista;
    }

    public static List<Integer> ejercicio6() {
        List<Integer> lista = new ArrayList<>();
        int numero =320;
        do {
            System.out.println(numero);
            lista.add(numero);
            numero -= 20;
        }
        while (numero >= 160);
        return lista;
    }

    public static List<Integer> ejercicio7(int i) {
        return null;
    }

    public static List<Integer> ejercicio8(int i) {
        return null;
    }

    public static List<Integer> ejercicio9(int i) {
        return null;
    }

    public static double ejercicio10(List<Integer> numeros) {
        return 0;
    }

    public static List<Integer> ejercicio11(int i) {
        return null;
    }

    public static List<Integer> ejercicio12(int n) {
        List<Integer> fibonacci = new ArrayList<>();
        if (n <= 0) {
            return fibonacci;
        }

        // Generar la secuencia de Fibonacci
        fibonacci.add(0);

        if (n > 1) {
            fibonacci.add(1);
        }

        for (int i = 2; i < n; i++) {
            int num = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(num);
        }

        return fibonacci;
    }

    public static List<Integer> ejercicio13(List<Integer> numeros) {
        return null;
    }

    public static double ejercicio14(int i, int i1) {
        return 0;
    }

    public List<Double> ejercicio15(double base, int terms) {
        List<Double> potencias = new ArrayList<>();
        for (int i = 1; i <= terms; i++) {
            potencias.add(Math.pow(base, i));
        }
        return potencias;
    }

    public static boolean ejercicio16(int i) {
        return false;
    }

    public static List<Integer> ejercicio17(int i) {
        return null;
    }

    public static List<Integer> ejercicio18(int i, int i1) {
        return null;
    }

    public List<String> ejercicio19(int filas, char caracter) {
        List<String> piramide = new ArrayList<>();

        for (int i = 1; i <= filas; i++) {
            // Calcula los espacios en blanco a la izquierda
            String espacios = " ".repeat(filas - i);
            // Calcula los caracteres para la pirámide
            String caracteres = String.valueOf(caracter).repeat(2 * i - 1);
            // Agrega la línea completa (espacios + caracteres) a la lista
            piramide.add(espacios + caracteres);
        }

        return piramide;
    }

    public static List<Integer> ejercicio20(int i, char c) {
        return null;
    }

    public static List<Integer> ejercicio21(List<Integer> numeros) {
        return null;
    }

    public List<Integer> ejercicio22() {
        return List.of();
    }
}
