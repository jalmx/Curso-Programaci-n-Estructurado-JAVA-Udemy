import java.util.Scanner;

public class TablaWhileDinamica{

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.println("Dar el valor de la tabla");
        int tabla = leer.nextInt();

        int contador = 1;
        int limite = 10;

        while(contador <= limite ){
            System.out.printf("%d x %d = %d \n", tabla, contador, tabla * contador);
            contador++;
        }
        System.out.println("Termino While");

        contador = 1;

        do{
            System.out.printf("%d x %d = %d \n", tabla, contador, tabla * contador);
            contador++;

        }while(contador <= limite);
        
        System.out.println("Termino Do-While");
    }

}