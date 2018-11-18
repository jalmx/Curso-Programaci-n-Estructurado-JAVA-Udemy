import java.util.Scanner;

public class TablaDinamica{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Cuál tabla quieres calcular?");
        int tabla = leer.nextInt();

        System.out.println("La tabla eligida fue: " + tabla);

        for(int x = 1; x <=10; x++){
            int multiplicacion = tabla *x;

            System.out.printf(" %d x %d = %d \n", tabla, x, multiplicacion);
        }

    }

}