package Java_ProgramaBasico_01;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosES {
    public static double multiplicar(int num, int num2) {

        int resultado = num * num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double eurosAPesetas(int euros) {
        double pesetas = 166.386;
        double resultado = euros * pesetas;
        return resultado;
    }

    public static double pesetasAEuros(int pesetas) {
        double euros = 1/166.386;
        double resultado = pesetas * euros;
        return resultado;
    }

    public static String operacionesBasicas(double a, double b) {
        double suma = a + b;
        double resta = a - b;
        double multiplicacion = a * b;
        double division = a / b;

        // Cambiamos el locale a US para el formato
        Locale locale = Locale.US;

        // Formateamos los resultados para que tengan dos decimales usando el locale US
        return String.format(locale, "Suma: %.2f\nResta: %.2f\nMultiplicación: %.2f\nDivisión: %.2f",
                suma, resta, multiplicacion, division);
    }

    public static double areaRectangulo(int base, int altura) {
        return base*altura;
    }

    public static double areaTriangulo(int base, int altura) {
        return base*altura/2;
    }

    public static double calcularTotalFactura(int baseImponible) {
        double iva = 1.21;

        return baseImponible * iva;

    }

    public static double calcularSalarioSemanal(int horasTrabajadas) {
        int euroLaHora = 12;

        return (horasTrabajadas * euroLaHora) ;

    }

    public static double volumenCono(int radio, int altura) {

        double volume = (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;

        return volume;

    }

    public static double mbAKb(double mb) {
        // 1 MB = 1024 KB
        return mb * 1024;
    }

    // Método para convertir de KB a MB
    public static double kbAMb(double kb) {
        // 1024 KB = 1 MB
        return kb / 1024;
    }

    public static String calcularPrecioFinal(double baseImponible, String tipoIva, String codigoPromocional) {
        double iva = 0;
        double descuento = 0;

        // Determinar el porcentaje de IVA según el tipo
        switch (tipoIva.toLowerCase()) {
            case "reducido":
                iva = 0.10;
                break;
            case "normal":
                iva = 0.21;
                break;
            default:
                iva = 0; // Por defecto, si no se indica un tipo válido de IVA
                break;
        }

        // Calcular el IVA
        double importeIva = baseImponible * iva;
        double precioConIva = baseImponible + importeIva;

        // Determinar el descuento según el código promocional
        switch (codigoPromocional.toLowerCase()) {
            case "mitad":
                descuento = precioConIva / 2;
                break;
            case "ninguno":
                descuento = 0;
                break;
            default:
                descuento = 0;
                break;
        }

        // Calcular el precio final con el descuento
        double precioFinal = precioConIva - descuento;

        // Asegurarse de que el formato use puntos decimales
        return String.format(Locale.US, "Base imponible %.2f\nIVA (%.0f%%) %.2f\nPrecio con IVA %.2f\nCód. promo. (%s): -%.2f\nTOTAL %.2f",
                baseImponible, iva * 100, importeIva, precioConIva, codigoPromocional, descuento, precioFinal);
    }

    public static double calcularNotaNecesaria(double primeraNota, double notaFinalDeseada) {
        double pesoPrimeraNota = 0.4;  // Asumimos que la primera nota cuenta un 40%
        double pesoSegundaNota = 0.6;  // La segunda nota cuenta un 60%

        // Aplicamos la fórmula con ponderaciones
        return (notaFinalDeseada - pesoPrimeraNota * primeraNota) / pesoSegundaNota;
    }
}
