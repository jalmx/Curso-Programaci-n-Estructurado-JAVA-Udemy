import java.util.Scanner;

public class Sexo{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Qué sexo eres?\n1)Hombre\n2)Mujer");
        int sexo = sc.nextInt();

        if(sexo == 1){
            System.out.println("Eres Macho alfa lomo plateado");
        }else if(sexo == 2) {
                System.out.println("Eres una linda señorita");
            }else{
                System.out.println("Opción no posible");
            }
    }
}