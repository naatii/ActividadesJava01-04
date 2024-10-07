package Java_ProgramaBasico_01;

import java.util.Locale;

public class EjerciciosES {
    public static double multiplicar(int i, int i1) {

        return 0;
    }

    public static double eurosAPesetas(int i) {

        return 0;
    }

    public static double pesetasAEuros(int i) {
        return 0;
    }

    public static String operacionesBasicas(int i, int i1) {
        return null;
    }

    public static double areaRectangulo(int i, int i1) {
        return 0;
    }

    public static double areaTriangulo(int i, int i1) {
        return 0;

    }

    public static double calcularTotalFactura(int i) {
        return 0;

    }

    public static double calcularSalarioSemanal(int i) {
        return 0;

    }

    public static double volumenCono(int i, int i1) {
        return 0;

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
