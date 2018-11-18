import java.util.Scanner;

public class CalculadoraInfinita{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("Calculadora básica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            opcion = leer.nextInt();

            double valor1, valor2, resultado;

            switch(opcion){
                case 1:
                    System.out.println("Suma");
                    System.out.println("Dar valor 1: ");
                    valor1 = leer.nextDouble();
                    System.out.println("Dar valor 2: ");
                    valor2 = leer.nextDouble();
                    resultado = valor1 + valor2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("Dar valor 1: ");
                    valor1 = leer.nextDouble();
                    System.out.println("Dar valor 2: ");
                    valor2 = leer.nextDouble();
                    resultado = valor1 - valor2;
                    System.out.println("El resultado de la Resta es: " + resultado);
                    break;
                case 3:
                    System.out.println("Multiplicación");
                    System.out.println("Dar valor 1: ");
                    valor1 = leer.nextDouble();
                    System.out.println("Dar valor 2: ");
                    valor2 = leer.nextDouble();
                    resultado = valor1 * valor2;
                    System.out.println("El resultado de la Multiplicación es: " + resultado);
                    break;
                case 4:
                    System.out.println("División");
                    System.out.println("Dar valor 1: ");
                    valor1 = leer.nextDouble();
                    System.out.println("Dar valor 2: ");
                    valor2 = leer.nextDouble();
                    resultado = valor1 / valor2;
                    System.out.println("El resultado de la División es: " + resultado);
                    break;
                case 5:
                    System.out.println("Haz salido del programa, te vamos a extrañar");
                    break;
                default:
                    System.out.println("La opción no es posible");
            }

        }while(opcion != 5);

    }
    
}