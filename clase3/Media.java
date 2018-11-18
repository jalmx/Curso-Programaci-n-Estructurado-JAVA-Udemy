import java.util.Scanner;

public class Media{
    
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Cálculo de la Media");

        System.out.println("Cuántos valores tienes?");
        int total = leer.nextInt();

        double suma = 0;

        for(int i = 0; i < total ; i++){
            System.out.print("Dar el valor " + (i+1) + ": ");
            int aux = leer.nextInt();
            suma = aux + suma;
            System.out.println();
        }

        double media = suma / total;

        System.out.println("El valor de media es: " + media);
    }
}