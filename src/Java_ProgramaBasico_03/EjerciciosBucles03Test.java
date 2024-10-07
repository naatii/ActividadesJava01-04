package Java_ProgramaBasico_03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class EjerciciosAleatoriosBuclesBuclesTest {

    private EjerciciosBucles ejercicios;

    @BeforeEach
    public void setUp() {
        ejercicios = new EjerciciosBucles();
    }

    // Test Ejercicio 1
    @Test
    public void testEjercicio1() {
        List<Integer> esperados = Arrays.asList(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100);
        assertEquals(esperados, ejercicios.ejercicio1());
    }

    // Test Ejercicio 2
    @Test
    public void testEjercicio2() {
        List<Integer> esperados = Arrays.asList(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100);
        assertEquals(esperados, ejercicios.ejercicio2());
    }

    // Test Ejercicio 3
    @Test
    public void testEjercicio3() {
        List<Integer> esperados = Arrays.asList(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100);
        assertEquals(esperados, ejercicios.ejercicio3());
    }

    // Test Ejercicio 4
    @Test
    public void testEjercicio4() {
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicios.ejercicio4());
    }

    // Test Ejercicio 5
    @Test
    public void testEjercicio5() {
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicios.ejercicio5());
    }

    // Test Ejercicio 6
    @Test
    public void testEjercicio6() {
        List<Integer> esperados = Arrays.asList(320, 300, 280, 260, 240, 220, 200, 180, 160);
        assertEquals(esperados, ejercicios.ejercicio6());
    }

    // Test Ejercicio 7
    @Test
    public void testEjercicio7() {
        assertEquals("La caja fuerte se ha abierto satisfactoriamente.", ejercicios.ejercicio7(1234));
        assertEquals("Lo siento, esa no es la combinación.", ejercicios.ejercicio7(1111));
    }

    // Test Ejercicio 8
    @Test
    public void testEjercicio8() {
        List<String> esperados = Arrays.asList(
                "5 x 1 = 5",
                "5 x 2 = 10",
                "5 x 3 = 15",
                "5 x 4 = 20",
                "5 x 5 = 25",
                "5 x 6 = 30",
                "5 x 7 = 35",
                "5 x 8 = 40",
                "5 x 9 = 45",
                "5 x 10 = 50"
        );
        assertEquals(esperados, ejercicios.ejercicio8(5));
    }

    // Test Ejercicio 9
    @Test
    public void testEjercicio9() {
        assertEquals(5, ejercicios.ejercicio9(12345));
        assertEquals(1, ejercicios.ejercicio9(0));
    }

    // Test Ejercicio 10
    @Test
    public void testEjercicio10() {
        List<Integer> numeros = Arrays.asList(10, 20, 30, -1);
        assertEquals(20.0, ejercicios.ejercicio10(numeros), 0.01);
    }

    // Test Ejercicio 11
    @Test
    public void testEjercicio11() {
        List<String> esperados = Arrays.asList(
                "2 4 8",
                "3 9 27",
                "4 16 64",
                "5 25 125",
                "6 36 216"
        );
        assertEquals(esperados, ejercicios.ejercicio11(2));
    }

    // Test Ejercicio 12
    @Test
    public void testEjercicio12() {
        List<Integer> esperados = Arrays.asList(0, 1, 1, 2, 3, 5);
        assertEquals(esperados, ejercicios.ejercicio12(6));
    }

    // Test Ejercicio 13
    @Test
    public void testEjercicio13() {
        List<Integer> numeros = Arrays.asList(1, -2, 3, -4, 5, -6, 7, -8, 9, -10);
        List<Integer> resultados = ejercicios.ejercicio13(numeros);
        assertEquals(5, resultados.get(0)); // Positivos
        assertEquals(5, resultados.get(1)); // Negativos
    }

    // Test Ejercicio 14
    @Test
    public void testEjercicio14() {
        assertEquals(32.0, ejercicios.ejercicio14(2, 5), 0.01);
    }

    // Test Ejercicio 15
    @Test
    public void testEjercicio15() {
        List<Double> esperados = Arrays.asList(2.0, 4.0, 8.0, 16.0, 32.0);
        assertEquals(esperados, ejercicios.ejercicio15(2, 5));
    }

    // Test Ejercicio 16
    @Test
    public void testEjercicio16() {
        assertTrue(ejercicios.ejercicio16(7));
        assertFalse(ejercicios.ejercicio16(10));
    }

    // Test Ejercicio 17
    @Test
    public void testEjercicio17() {
        assertEquals(5050, ejercicios.ejercicio17(0));
        assertEquals(-1, ejercicios.ejercicio17(-5)); // Número no positivo
    }

    // Test Ejercicio 18
    @Test
    public void testEjercicio18() {
        List<Integer> esperados = Arrays.asList(10, 17, 24, 31, 38, 45, 52);
        assertEquals(esperados, ejercicios.ejercicio18(10, 55));
        esperados = Arrays.asList(7, 14, 21, 28, 35, 42, 49);
        assertEquals(esperados, ejercicios.ejercicio18(7, 50));

        esperados = Arrays.asList(14, 21, 28, 35, 42, 49);
        assertEquals(esperados, ejercicios.ejercicio18(14, 50));

        esperados = Arrays.asList(50, 43, 36, 29, 22, 15, 8);
        assertEquals(esperados, ejercicios.ejercicio18(50, 7));

        assertNull(ejercicios.ejercicio18(10, 10)); // Números iguales, no válido
    }

    @Test
    public void testEjercicio19() {
        List<String> esperados = Arrays.asList(
                "    *",
                "   ***",
                "  *****",
                " *******",
                "*********"
        );
        assertEquals(esperados, ejercicios.ejercicio19(5, '*'));

        esperados = Arrays.asList(
                "   #",
                "  ###",
                " #####",
                "#######"
        );
        assertEquals(esperados, ejercicios.ejercicio19(4, '#'));

        esperados = Arrays.asList(
                "  @",
                " @@@",
                "@@@@@"
        );
        assertEquals(esperados, ejercicios.ejercicio19(3, '@'));
    }

    @Test
    public void testEjercicio20() {
        List<String> esperados = Arrays.asList(
                "    *",
                "   * *",
                "  *   *",
                " *     *",
                "*********"
        );
        assertEquals(esperados, ejercicios.ejercicio20(5, '*'));

        esperados = Arrays.asList(
                "   #",
                "  # #",
                " #   #",
                "#######"
        );
        assertEquals(esperados, ejercicios.ejercicio20(4, '#'));

        esperados = Arrays.asList(
                "  @",
                " @ @",
                "@@@@@"
        );
        assertEquals(esperados, ejercicios.ejercicio20(3, '@'));
    }

    @Test
    public void testEjercicio21() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1);
        String esperado = "Total números: 10, Media impares: 5.0, Mayor par: 10";
        assertEquals(esperado, ejercicios.ejercicio21(numeros));

        numeros = Arrays.asList(2, 4, 6, 8, 10, -1);
        esperado = "Total números: 5, Media impares: 0.0, Mayor par: 10";
        assertEquals(esperado, ejercicios.ejercicio21(numeros));

        numeros = Arrays.asList(1, 3, 5, 7, 9, -1);
        esperado = "Total números: 5, Media impares: 5.0, Mayor par: No hay pares";
        assertEquals(esperado, ejercicios.ejercicio21(numeros));

        numeros = Arrays.asList(-1);
        esperado = "Total números: 0, Media impares: 0.0, Mayor par: No hay pares";
        assertEquals(esperado, ejercicios.ejercicio21(numeros));
    }

    @Test
    public void testEjercicio22() {
        List<Integer> esperados = Arrays.asList(
                2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        );
        assertEquals(esperados, ejercicios.ejercicio22());
    }
}

