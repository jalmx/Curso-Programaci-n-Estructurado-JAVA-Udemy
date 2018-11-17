import java.util.Scanner;

public class Divisas{
    
    public static void main(String[]args){

        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Calculadora de Divisas");
        System.out.println("----------------------");
        System.out.println("1) Dólares a Pesos MXN");
        System.out.println("2) Pesos MXN a Dólares");
        int opcion = leer.nextInt();
        double cantidad;

        double dolares = 1;
        double pesos = 18.90;

        switch(opcion){
            case 1:
            System.out.println("Dólares a Pesos MXN");
            System.out.println("Cuántos dólares tienes?");
            cantidad = leer.nextDouble();
            cantidad = (cantidad * pesos)/ dolares;
            System.out.printf("Tienes %.2f pesos", cantidad);
            break;
            case 2:
            System.out.println("Pesos MXN a Dólares");
            System.out.println("Cuántos pesos tienes?");
            cantidad = leer.nextDouble();
            cantidad = (cantidad * dolares)/ pesos;
            System.out.printf("Tienes %.2f dolares", cantidad);
            break;
            default:
             System.out.println("La ópcion no existe");
        }

    }
}