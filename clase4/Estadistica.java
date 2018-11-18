import java.util.Scanner;

public class Estadistica{

    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Cuántos datos tienes?");
        int total = leer.nextInt();
        double suma =0;

        double valores[] = new double[total]; //guardar datos

        for(int i = 0; i < total ; i++){
            System.out.println("Dar el valor " + (i+1));
            double aux = leer.nextDouble();
            
            valores[i] = aux;
            suma += aux;
        }

        double media = suma /total;

        double sumaDesviacion = 0;

        for(int i = 0; i < valores.length; i++){
            sumaDesviacion += Math.pow(valores[i] - media, 2); //Math.pow(base, exp);
        }

        double desviacion = Math.sqrt(sumaDesviacion/total);

        System.out.println("La media es: " + media);
        System.out.println("La desviación estandar es: " + desviacion);
    }
}