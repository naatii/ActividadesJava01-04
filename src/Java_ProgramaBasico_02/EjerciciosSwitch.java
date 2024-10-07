package Java_ProgramaBasico_02;

class EjerciciosSwitch {


    public static String asignaturaPorDia(String dia) {
        switch (dia) {
            case "lunes":
                return "Matemáticas";
            case "martes":
                return "Lengua";
            case "miércoles":
                return "Inglés";
            case "jueves":
                return "Ciencias";
            case "viernes":
                return "Historia";
            default:
                return "Día no válido";
        }
    }

    public static String saludoPorHora(int hora) {
        if (hora < 0 || hora > 24) {
            return "Hora no válida"; // Manejar horas fuera de rango
        }

        switch (hora) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return "Buenos días";
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return "Buenas tardes";
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 21:
            case 22:
            case 23:
                return "Buenas noches";
            default:
                return "Hora no válida"; // Para la hora 0
        }
    }

    public static String nombreDiaSemana(int numero) {
        switch (numero) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Número no válido";
        }
    }

    public static double calcularSalarioSemanal(int horas) {
        double tarifaNormal = 12.0;
        double tarifaExtra = 16.0;
        int horasNormales = 40;
        double salario;

        if (horas <= horasNormales) {
            salario = horas * tarifaNormal;
        } else {
            int horasExtras = horas - horasNormales;
            salario = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        return salario;
    }

    public static String resolverEcuacionPrimerGrado(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                return "Infinitas soluciones";
            } else {
                return "No hay solución";
            }
        } else {
            double x = -b / a;
            return "x = " + x;
        }
    }

    public static double calcularTiempoCaida(double altura) {
        final double g = 9.80665;
        return Math.sqrt((2 * altura) / g);
    }

    public static double calcularMediaNotas(int i, int i1, int i2) {
        return (i + i1 + i2) / 3;
    }

    public static String calificarNota(double nota) {
        if (nota < 5.0) {
            return "Insuficiente";
        } else if (nota < 6.0) {
            return "Suficiente";
        } else if (nota < 8.0) {
            return "Bien";
        } else if (nota < 9.0) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    public static String resolverEcuacionSegundoGrado(double a, double b, double c) {
        if (a == 0) {
            return "No es una ecuación de segundo grado"; // Si a es 0, no es cuadrática
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return String.format("x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return String.format("x = %.2f", x);
        } else {
            return "No hay soluciones reales";
        }
    }

    public static String determinarHoroscopo(int dia, int mes) {
        return "";
    }

    public static int calcularSegundosHastaMedianoche(int horas, int minutos) {
        return horas;
    }

    public static int realizarMiniCuestionario() {
        return 0;
    }

    public static int[] ordenarTresNumeros(int i, int i1, int i2) {
        return new int[0];
    }

    public static String analizarNumero(int numero) {
        return "";
    }

    public static String dibujarPiramide(char c, String arriba, int i) {
        return arriba;
    }

    public static int calcularProbabilidadInfidelidad() {
        return 0;
    }

    public static int obtenerUltimaCifra(int numero) {
        return numero;
    }

    public static int obtenerPrimeraCifra(int numero) {
        return numero;
    }

    public static int contarDigitos(int numero) {
        return numero;
    }

    public static boolean esCapicua(int numero) {
        return false;
    }

    public static double calcularNotaTrimestre(int i, int i1, boolean b) {
        return 0;
    }

    public static int calcularMinutosHastaFinDeSemana(String dia, int hora, int minutos) {
        return hora;
    }
}
