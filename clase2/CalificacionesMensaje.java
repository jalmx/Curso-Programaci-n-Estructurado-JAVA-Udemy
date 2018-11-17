import java.util.Scanner;

public class CalificacionesMensaje{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa tu calificación");
        double calificacion = sc.nextDouble();

        if(calificacion >= 0 && calificacion < 6){
            System.out.println("Te falto esforzarte");
        }

        if(calificacion >=6 && calificacion <= 7){
            System.out.println("De panzazo");
        }

        if(calificacion > 7 && calificacion <= 8){
            System.out.println("Echale más punch");
        }

        if(calificacion > 8 && calificacion < 9){
            System.out.println("Puedes mejorar");
        }

        if(calificacion >= 9 && calificacion < 10){
            System.out.println("Muy bien te falto tantito");
        }

        if(calificacion == 10){
            System.out.println("Excelente, con toda la actitud");
        }

        if( calificacion < 0 || calificacion > 10 ){
            System.out.println("Calificación no posible");
        }
    }
}