import java.util.Scanner;

public class ParImpar{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dar un número para conocer si es par o impar");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.println("El número es par");
        }
        
        if(numero % 2 != 0){
            System.out.println("El número es impar");
        }

        if(numero > 10 ){
            System.out.println("El número es mayor a 10");
        }
    }
}