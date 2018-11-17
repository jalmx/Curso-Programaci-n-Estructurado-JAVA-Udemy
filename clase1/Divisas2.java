import java.util.Scanner;

public class Divisas2{
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);// creando instancia de Scanner

        System.out.println("---------------------------------------");
        System.out.println("Calculadora de divisas de Dolares a Pesos MXN");
        System.out.println("---------------------------------------");

        double cantidad;
        double peso = 19.10;
        double dolar = 1;

        System.out.print("Cuantos dolares tienes? ");
        cantidad = leer.nextDouble();

        double resultado = (cantidad *peso)/ dolar;

        System.out.printf("Tienes %.2f dlls y son %.2f pesos\n",cantidad, resultado );
    }
}