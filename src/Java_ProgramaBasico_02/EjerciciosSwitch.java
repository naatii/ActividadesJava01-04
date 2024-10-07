package Java_ProgramaBasico_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

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

    public static String dibujarPiramide(char caracter, String orientacion, int fila) {
       String resultado = "";
       switch (orientacion.toLowerCase()) {
           case "arriba":
               for (int i = 1; i < fila; i++) {
                   if (i == 1){
                       resultado += " ".repeat(fila - i) + String.valueOf(caracter).repeat(2 * i -1)+"\n";
                   } else {
                       resultado += " ".repeat(fila - i) + String.valueOf(caracter).repeat(2 * i -1)+"\n";
                   }

               }
               break;

           case "abajo":
               for (int i = fila; i >= 1; i--) {
                   if (i == fila){
                       resultado +=  String.valueOf(caracter).repeat(2 * i -1)+"\n";
                   } else {
                       resultado +=  String.valueOf(caracter).repeat(2 * i -1)+"\n";
                   }
               }
               break;

           case "izquierda":
               for (int i = 1; i <= fila; i++) {
                   resultado += String.valueOf(caracter).repeat(i) + "\n";
               }

               for (int i = fila; i >= 1; i--){
                   resultado += String.valueOf(caracter).repeat(i) + "\n";
               }
               break;

           case "derecha":
               for (int i = 1; i <= fila; i++) {
                   resultado += " ".repeat(fila - i) + String.valueOf(caracter).repeat(i) + "\n";
               }
               for (int i = fila; i >= 1; i--){
                   resultado += " ".repeat(fila - i) + String.valueOf(caracter).repeat(i) + "\n";
               }
               break;

           default:
               if (orientacion.isEmpty()){
                   resultado = "No se ha proporcionado una orientación válida\n";
               } else {
                   resultado = "Orientación no válida\n";
               }
               break;
       }
       return resultado;
    }

    public static int calcularProbabilidadInfidelidad() {
        String[] preguntas = new String[5];
        String[] conclusiones = new String[3];
        //Cargar preguntas y conclusiones desde el archivo
        try (BufferedReader br = new BufferedReader(new FileReader("test_infidelidad.txt"))) {
            for (int i = 0; i < 5; i++) {
                preguntas[i] = br.readLine();
            }
            for (int i = 0; i < 3; i++) {
                conclusiones[i] = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error al leer el arhivo:"+e.getMessage());
            return 0;
        }
        Scanner sc = new Scanner(System.in);
        int puntos = 0;

        // hacemos las preguntas al usuario
        for(String pregunta : preguntas) {
            System.out.println(pregunta+" (verdadero/falso)");
            if (sc.nextLine().trim().equals("verdadero")) {
                puntos+= 3;
            }
        }

        // Determina la conclusion según la puntuación
        String conclusion;
        if (puntos <= 6){
            conclusion = conclusiones[0];
        } else if (puntos <= 10) {
            conclusion = conclusiones[1];
        } else {
            conclusion = conclusiones[2];
        }
        System.out.println(conclusion);
        sc.close();
        return puntos;
    }

    public static int obtenerUltimaCifra(int numero) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();

        // se calcula la ultima cifra
        int ultimaCifra = Math.abs(numero % 10);

        System.out.println("La ultima cifra de "+numero+" es: "+ultimaCifra);
        sc.close();
        return numero;
    }

    public static int obtenerPrimeraCifra(int numero) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero (hasta 5 cifras): ");
        numero = sc.nextInt();
        if (numero < -99999 || numero > 99999) {
            System.out.println("El numero debe tener hasta 5 cifras");
        }else {
            // usamos el valor absoluto para trabajar con un numero positivo
            numero = Math.abs(numero);
            // obtener la primera cifra
            int primeraCifra = numero;

            // dividir el numero entre 10 hasta que sea menor que 10
            while (primeraCifra >= 10) {
                primeraCifra /= 10;
            }

            System.out.println("La primera cifra de "+numero+" es: "+primeraCifra);
        }
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
