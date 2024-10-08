package Java_ProgramaBasico_02;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class EjerciciosSwitchTest {

    // Ejercicio 1
    @ParameterizedTest
    @CsvSource({
            "lunes, Matemáticas",
            "martes, Lengua",
            "miércoles, Inglés",
            "jueves, Ciencias",
            "viernes, Historia",
            "sábado, Día no válido"
    })
    void testAsignaturaPorDia(String dia, String expectedAsignatura) {
        assertEquals(expectedAsignatura, EjerciciosSwitch.asignaturaPorDia(dia));
    }

    // Ejercicio 2
    @ParameterizedTest
    @CsvSource({
            "6, Buenos días",
            "12, Buenos días",
            "13, Buenas tardes",
            "20, Buenas tardes",
            "21, Buenas noches",
            "5, Buenas noches",
            "24, Hora no válida"
    })
    void testSaludoPorHora(int hora, String expectedSaludo) {
        assertEquals(expectedSaludo, EjerciciosSwitch.saludoPorHora(hora));
    }

    // Ejercicio 3
    @ParameterizedTest
    @CsvSource({
            "1, Lunes",
            "2, Martes",
            "3, Miércoles",
            "4, Jueves",
            "5, Viernes",
            "6, Sábado",
            "7, Domingo",
            "8, Número no válido"
    })
    void testNombreDiaSemana(int numero, String expectedDia) {
        assertEquals(expectedDia, EjerciciosSwitch.nombreDiaSemana(numero));
    }

    // Ejercicio 4
    @ParameterizedTest
    @CsvSource({
            "35, 420",
            "40, 480",
            "45, 560"
    })
    void testCalcularSalarioSemanal(int horas, double expectedSalario) {
        assertEquals(expectedSalario, EjerciciosSwitch.calcularSalarioSemanal(horas), 0.01);
    }

    // Ejercicio 5
    @ParameterizedTest
    @CsvSource({
            "1, -2, x = 2.0",
            "2, 4, x = -2.0",
            "0, 0, Infinitas soluciones",
            "0, 1, No hay solución"
    })
    void testResolverEcuacionPrimerGrado(double a, double b, String expected) {
        assertEquals(expected, EjerciciosSwitch.resolverEcuacionPrimerGrado(a, b));
    }

    // Ejercicio 6
    @ParameterizedTest
    @CsvSource({
            "10, 1.4285",
            "100, 4.5175",
            "1000, 14.2857"
    })
    void testCalcularTiempoCaida(double altura, double expectedTiempo) {
        assertEquals(expectedTiempo, EjerciciosSwitch.calcularTiempoCaida(altura), 0.0001);
    }

    // Ejercicio 7
    @Test
    void testCalcularMediaNotas() {
        assertEquals(7.0, EjerciciosSwitch.calcularMediaNotas(7, 8, 6), 0.01);
    }

    // Ejercicio 8
    @ParameterizedTest
    @CsvSource({
            "3.5, Insuficiente",
            "5.0, Suficiente",
            "6.5, Bien",
            "8.0, Notable",
            "9.5, Sobresaliente"
    })
    void testCalificarNota(double nota, String expectedCalificacion) {
        assertEquals(expectedCalificacion, EjerciciosSwitch.calificarNota(nota));
    }

    // Ejercicio 9
    @ParameterizedTest
    @CsvSource({
            "1, -5, 6, x1 = 3.00, x2 = 2.00",
            "1, 2, 1, x = -1.00",
            "1, 1, 1, No hay soluciones reales"
    })
    void testResolverEcuacionSegundoGrado(double a, double b, double c, String expected) {
        assertEquals(expected, EjerciciosSwitch.resolverEcuacionSegundoGrado(a, b, c));
    }

    // Ejercicio 10
    @ParameterizedTest
    @CsvSource({
            "21, 3, Aries",
            "22, 6, Cáncer",
            "23, 9, Libra",
            "22, 12, Capricornio"
    })
    void testDeterminarHoroscopo(int dia, int mes, String expectedHoroscopo) {
        assertEquals(expectedHoroscopo, EjerciciosSwitch.determinarHoroscopo(dia, mes));
    }

    // Ejercicio 11
    @ParameterizedTest
    @CsvSource({
            "23, 59, 60",
            "0, 0, 86400",
            "12, 30, 41400"
    })
    void testCalcularSegundosHastaMedianoche(int horas, int minutos, int expectedSegundos) {
        assertEquals(expectedSegundos, EjerciciosSwitch.calcularSegundosHastaMedianoche(horas, minutos));
    }

    // Ejercicio 12
    @Test
    void testRealizarMiniCuestionario() {
        // Este test dependerá de cómo implementes el cuestionario
        assertTrue(EjerciciosSwitch.realizarMiniCuestionario() >= 0 && EjerciciosSwitch.realizarMiniCuestionario() <= 10);
    }

    // Ejercicio 13
    @Test
    void testOrdenarTresNumeros() {
        assertArrayEquals(new int[]{1, 2, 3}, EjerciciosSwitch.ordenarTresNumeros(2, 3, 1));
    }

    // Ejercicio 14
    @ParameterizedTest
    @CsvSource({
            "10, Es par y divisible por 5",
            "4, Es par",
            "15, Es divisible por 5",
            "7, No es par ni divisible por 5"
    })
    void testAnalizarNumero(int numero, String expected) {
        assertEquals(expected, EjerciciosSwitch.analizarNumero(numero));
    }

    // Ejercicio 15
    @Test
    void testDibujarPiramide() {
        String expectedPiramide =
                "  *  \n" +
                " *** \n" +
                "*****\n";
        assertEquals(expectedPiramide, EjerciciosSwitch.dibujarPiramide('*', "arriba", 3));
    }

    // Ejercicio 16
    @Test
    void testCalcularProbabilidadInfidelidad() {
        // Este test dependerá de cómo implementes el cálculo
        assertTrue(EjerciciosSwitch.calcularProbabilidadInfidelidad() >= 0 && EjerciciosSwitch.calcularProbabilidadInfidelidad() <= 100);
    }

    // Ejercicio 17
    @ParameterizedTest
    @ValueSource(ints = {123, 456, 789, 1000})
    void testObtenerUltimaCifra(int numero) {
        assertEquals(numero % 10, EjerciciosSwitch.obtenerUltimaCifra(numero));
    }

    // Ejercicio 18
    @ParameterizedTest
    @CsvSource({
            "12345, 1",
            "67890, 6",
            "9, 9"
    })
    void testObtenerPrimeraCifra(int numero, int expectedPrimeraCifra) {
        assertEquals(expectedPrimeraCifra, EjerciciosSwitch.obtenerPrimeraCifra(numero));
    }

    // Ejercicio 19
    @ParameterizedTest
    @CsvSource({
            "12345, 5",
            "100, 3",
            "-9876, 4",
            "7, 1"
    })
    void testContarDigitos(int numero, int expectedDigitos) {
        assertEquals(expectedDigitos, EjerciciosSwitch.contarDigitos(numero));
    }

    // Ejercicio 20
    @ParameterizedTest
    @ValueSource(ints = {12321, 45654, 78987, 1})
    void testEsCapicua(int numero) {
        assertTrue(EjerciciosSwitch.esCapicua(numero));
    }

    @ParameterizedTest
    @ValueSource(ints = {12345, 67890, 10})
    void testNoEsCapicua(int numero) {
        assertFalse(EjerciciosSwitch.esCapicua(numero));
    }

    // Ejercicio 21
    @Test
    void testCalcularNotaTrimestre() {
        assertEquals(5.0, EjerciciosSwitch.calcularNotaTrimestre(4, 5, true), 0.01);
        assertEquals(7.5, EjerciciosSwitch.calcularNotaTrimestre(7, 8, false), 0.01);
    }

    // Ejercicio 22
    @ParameterizedTest
    @CsvSource({
            "lunes, 9, 0, 5760",
            "viernes, 14, 30, 30",
            "miércoles, 18, 0, 2580"
    })
    void testCalcularMinutosHastaFinDeSemana(String dia, int hora, int minutos, int expectedMinutos) {
        assertEquals(expectedMinutos, EjerciciosSwitch.calcularMinutosHastaFinDeSemana(dia, hora, minutos));
    }
}