package Java_ProgramaBasico_01;

import java.util.Locale;
import java.util.Scanner;

public class EjerciciosES {
    public static double multiplicar(int i, int i1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        int resultado = num * num2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double eurosAPesetas(int i) {
        Scanner sc = new Scanner(System.in);
        double pesetas = 166.386;

        System.out.println("Introduce los euros que quieres convertir en pesetas: ");
        int euros = sc.nextInt();

        double resultado = euros * pesetas;
        System.out.println("la conversion es: " + resultado + " pesetas");
        return resultado;
    }

    public static double pesetasAEuros(int i) {
        Scanner sc = new Scanner(System.in);
        double euros = 1/166.386;

        System.out.println("Introduce las pesetas que quieres convertir a euros: ");
        double pesetas = sc.nextDouble();
        double resultado = pesetas * euros;
        System.out.println("El la conversion es: " + resultado + " euros");
        return resultado;
    }

    public static String operacionesBasicas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("La suma es: "+ (num1 + num2));
        System.out.println("La resta es: "+ (num1 - num2));
        System.out.println("La division es: "+ (num1 / num2));
        System.out.println("La multiplicacion es: "+ (num1 * num2));
        return null;
    }

    public static double areaRectangulo(int i, int i1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base del rectangulo ");
        double base = sc.nextDouble();
        System.out.println("Ingresa la altura del rectangulo ");
        double altura = sc.nextDouble();

        double area = altura * base;
        System.out.println("El area del rectangulo es: " + area);
        return area;
    }

    public static double areaTriangulo(int i, int i1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del triangulo: ");
        double base = sc.nextDouble();

        System.out.println("Ingrese la altura del triangulo: ");
        double altura = sc.nextDouble();

        double resultado = base*altura/2;
        System.out.println("El resultado es: " + resultado);
        return resultado;
    }

    public static double calcularTotalFactura(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la base Imponible");
        int baseImponible = sc.nextInt();

        double iva = 1.21;

        double total = baseImponible * iva;
        System.out.println("El total es: " + total);
        return total;

    }

    public static double calcularSalarioSemanal(int i) {
        Scanner sc = new Scanner(System.in);

        int euroLaHora = 12;
        int semama = 7;
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        int totalHoras = (horasTrabajadas * euroLaHora) * semama;
        System.out.println("El salario semanal es: " + totalHoras);
        return totalHoras;

    }

    public static double volumenCono(int i, int i1) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el radio del cono: ");
        int radio = sc.nextInt();

        System.out.println("Introduce la altura del cono: ");
        int altura = sc.nextInt();

        double volume = (1.0 / 3) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volume del cono es: " + volume);
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
