import java.util.Scanner;

public class Calculadora{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Calculadora básica");
        System.out.println("--------------------");
        System.out.println("Opciones:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División");
        int opcion = sc.nextInt();

        if(opcion > 4 || opcion <= 0){
            System.out.println("Opción no posible");
        }else{
            System.out.println("Dar primer valor");
            double variable1 = sc.nextDouble();
            System.out.println("Dar segundo valor");
            double variable2 = sc.nextDouble();
            double resultado;

            if(opcion == 1){
            resultado = variable1 + variable2;
            System.out.println("La suma es: " + resultado);
            }else if(opcion == 2){
                resultado = variable1 - variable2;
                System.out.println("La resta es: " + resultado);
            }else if (opcion == 3){
                resultado = variable1 * variable2;
                System.out.println("La multiplicación es: " + resultado);
            }else if(opcion == 4){
                resultado = variable1 / variable2;
                System.out.println("La suma es: " + resultado);
            }
        }
    }
}