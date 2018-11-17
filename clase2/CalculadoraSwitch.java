import java.util.Scanner;

public class CalculadoraSwitch{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--------------------");
        System.out.println("Calculadora básica");
        System.out.println("--------------------");
        System.out.println("Opciones:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División");
        int opcion = leer.nextInt();
        
        double resultado, valor1, valor2;

        switch(opcion){
            case 1://suma
            System.out.println("Dar primer valor");
            valor1 = leer.nextDouble();
            System.out.println("Dar segundo valor");
            valor2 = leer.nextDouble();
            resultado = valor1 + valor2;
            System.out.println("El resultado de la suma es " + resultado);
            break;
            case 2://resta
            System.out.println("Dar primer valor");
            valor1 = leer.nextDouble();
            System.out.println("Dar segundo valor");
            valor2 = leer.nextDouble();
            resultado = valor1 - valor2;
            System.out.println("El resultado de la resta es " + resultado);
            break;
            case 3://multiplicación
            System.out.println("Dar primer valor");
            valor1 = leer.nextDouble();
            System.out.println("Dar segundo valor");
            valor2 = leer.nextDouble();
            resultado = valor1 * valor2;
            System.out.println("El resultado de la multiplicación es " + resultado);
            break;
            case 4://división
            System.out.println("Dar primer valor");
            valor1 = leer.nextDouble();
            System.out.println("Dar segundo valor");
            valor2 = leer.nextDouble();
            resultado = valor1 / valor2;
            System.out.println("El resultado de la división es " + resultado);
            break;
            default:
            System.out.println("La opción no existe ");
        }

    }
}