import java.util.Scanner;

public class Leer{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);//creando una instancia

        System.out.println("Cual es tu edad?");
        int edad = scanner.nextInt();

        System.out.println("Yo tambien tengo " + edad + " años");
        
        System.out.println("Cual es tu peso?");
        double peso = scanner.nextDouble();

        System.out.println("Yo peso " + (peso + 5) + " kilos");

        System.out.println("Cual es tu nombre?");
        String nombre = scanner.next();

        System.out.println("Yo igual me llamo " + nombre);
    }
}