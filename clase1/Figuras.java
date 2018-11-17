public class Figuras{

    public static void main(String args[]){

        //área cuadrado
        double lado = 2.5;
        double areaCuadrado = lado * lado;

        //área del rectángulo
        double base = 2.4;
        double altura = 4.1;

        double areaRectangulo = base * altura;

        //área del triángulo
        double baseTriangulo = 3.4;
        double alturaTriangulo = 5.6;
        double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;

        System.out.println("El área del cuadrado es: " + areaCuadrado);
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        System.out.println("El área del triangulo es: " + areaTriangulo);

    }
}