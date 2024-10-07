package Java_ProgramaBasico_04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class EjerciciosAleatoriosAleatoriosTest {

    private EjerciciosAleatorios ejercicios;

    @BeforeEach
    public void setUp() {
        ejercicios = new EjerciciosAleatorios();
    }

    // Test Ejercicio 1
    @Test
    public void testEjercicio1() {
        int[] dados = ejercicios.ejercicio1();
        assertEquals(3, dados.length);
        for (int dado : dados) {
            assertTrue(dado >= 1 && dado <= 6);
        }
    }

    // Test Ejercicio 2
    @Test
    public void testEjercicio2() {
        String carta = ejercicios.ejercicio2();
        assertNotNull(carta);
        assertFalse(carta.isEmpty());
        // No podemos predecir el resultado exacto, pero podemos verificar el formato
        assertTrue(carta.matches("([2-9]|10|J|Q|K|A) de (Picas|Corazones|Diamantes|Tréboles)"));
    }

    // Test Ejercicio 3
    @Test
    public void testEjercicio3() {
        String carta = ejercicios.ejercicio3();
        assertNotNull(carta);
        assertFalse(carta.isEmpty());
        assertTrue(carta.matches("(As|[2-7]|Sota|Caballo|Rey) de (Oros|Copas|Espadas|Bastos)"));
    }

    // Test Ejercicio 4
    @Test
    public void testEjercicio4() {
        List<Integer> numeros = ejercicios.ejercicio4();
        assertEquals(20, numeros.size());
        for (int numero : numeros) {
            assertTrue(numero >= 0 && numero <= 10);
        }
    }

    // Test Ejercicio 5
    @Test
    public void testEjercicio5() {
        int[] numeros = ejercicios.ejercicio5();
        assertEquals(50, numeros.length);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0;
        for (int numero : numeros) {
            assertTrue(numero >= 100 && numero <= 199);
            if (numero > max) max = numero;
            if (numero < min) min = numero;
            suma += numero;
        }
        double media = suma / 50.0;
        // Aquí podríamos hacer más aserciones si fuera necesario
    }

    // Test Ejercicio 6
    @Test
    public void testEjercicio6() {
        int[] intentos = {50, 75, 25, 62, 88};
        // No podemos predecir el número secreto, así que solo verificamos que el método retorna un booleano
        boolean resultado = ejercicios.ejercicio6(intentos);
        assertNotNull(resultado);
    }

    // Test Ejercicio 7
    @Test
    public void testEjercicio7() {
        String[][] apuestas = ejercicios.ejercicio7();
        assertEquals(15, apuestas.length);
        for (String[] fila : apuestas) {
            assertEquals(3, fila.length);
            for (String resultado : fila) {
                assertTrue(resultado.equals("1") || resultado.equals("X") || resultado.equals("2"));
            }
        }
    }

    // Test Ejercicio 8
    @Test
    public void testEjercicio8() {
        String[][] apuestas = ejercicios.ejercicio8();
        assertEquals(15, apuestas.length);
        for (String[] fila : apuestas) {
            assertEquals(3, fila.length);
            for (String resultado : fila) {
                assertTrue(resultado.equals("1") || resultado.equals("X") || resultado.equals("2"));
            }
        }
    }

    // Test Ejercicio 9
    @Test
    public void testEjercicio9() {
        List<Integer> numeros = ejercicios.ejercicio9();
        assertTrue(numeros.size() >= 1);
        assertEquals(24, (int) numeros.get(numeros.size() - 1));
        for (int numero : numeros) {
            assertTrue(numero % 2 == 0);
            assertTrue(numero >= 0 && numero <= 100);
        }
    }

    // Test Ejercicio 10
    @Test
    public void testEjercicio10() {
        List<String> lineas = ejercicios.ejercicio10();
        assertEquals(10, lineas.size());
        for (String linea : lineas) {
            assertTrue(linea.length() >= 1 && linea.length() <= 40);
            // Verificar que la línea está compuesta por un solo carácter repetido
            char caracter = linea.charAt(0);
            for (char c : linea.toCharArray()) {
                assertEquals(caracter, c);
            }
        }
    }

    // Test Ejercicio 11
    @Test
    public void testEjercicio11() {
        String[] notas = ejercicios.ejercicio11();
        assertEquals(20, notas.length);
        for (String nota : notas) {
            assertTrue(nota.equals("Suspenso") || nota.equals("Suficiente") || nota.equals("Bien") ||
                    nota.equals("Notable") || nota.equals("Sobresaliente"));
        }
    }

    // Test Ejercicio 12
    @Test
    public void testEjercicio12() {
        int cantidad = 100;
        char[] caracteres = ejercicios.ejercicio12(cantidad);
        assertEquals(cantidad, caracteres.length);
        for (char c : caracteres) {
            assertTrue(c >= 32 && c <= 126);
        }
    }

    // Test Ejercicio 13
    @Test
    public void testEjercicio13() {
        List<int[]> tiradas = ejercicios.ejercicio13();
        assertTrue(tiradas.size() >= 1);
        int[] ultimaTirada = tiradas.get(tiradas.size() - 1);
        assertEquals(ultimaTirada[0], ultimaTirada[1]);
        for (int[] tirada : tiradas) {
            assertTrue(tirada[0] >= 1 && tirada[0] <= 6);
            assertTrue(tirada[1] >= 1 && tirada[1] <= 6);
        }
    }

    // Test Ejercicio 14
    @Test
    public void testEjercicio14() {
        boolean[] mayorMenor = {true, false, true, false, true};
        int[] intentos = ejercicios.ejercicio14(mayorMenor);
        assertEquals(5, intentos.length);
        for (int intento : intentos) {
            assertTrue(intento >= 0 && intento <= 100);
        }
    }

    // Test Ejercicio 15
    @Test
    public void testEjercicio15() {
        String melodia = ejercicios.ejercicio15();
        assertNotNull(melodia);
        assertTrue(melodia.endsWith("||"));
        // Verificar que la última nota coincide con la primera
        String[] partes = melodia.split(" \\| | \\|\\|");
        String primeraNota = partes[0].split(" ")[0];
        String ultimaNota = partes[partes.length - 1].split(" ")[partes[partes.length - 1].split(" ").length - 1];
        assertEquals(primeraNota, ultimaNota);
    }
}