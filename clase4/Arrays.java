
public class Arrays{

    public static void main(String[] args){

        int array1[] = new int[5];//tiene 5 espacios pero esta vacío

        int array2[] = {1,2,3,4,5,6}; //tienes 6 espacios, ya tiene valores por default

        array1[1] = 100;
        array1[2] = 500;
        array1[3] = 10;
        array1[4] = 200;
        array1[0] = 1;

        System.out.println("Array 1 en la posición 3: " + array1[3]); // 10
        System.out.println("Array 1 en la posición 2: " + array1[2]); // 500
        System.out.println("Array 1 en la posición 0: " + array1[0]); // 1

        array1[3] = 555;
        System.out.println("Array 1 en la posición 3: " + array1[3]); // 555
        //---------------------------------

        System.out.println("Array 2 en la posición 0: " +  array2[0]);//1
        System.out.println("Array 2 en la posición 3: " +  array2[3]);//4
        System.out.println("Array 2 en la posición 5: " +  array2[5]);//6
        array2[3] = 20;
        System.out.println("Array 2 en la posición 3: " +  array2[3]);//20
        //-------------------------
        System.out.println("---------------------");
        
        for(int i = 0; i < array1.length; i ++){
             System.out.println("Array 1 en la posición " + i + ": " + array1[i]);
        }
 
        System.out.println("---------------------");
        
         for(int i = 0; i < array2.length; i ++){
             System.out.println("Array 2 en la posición " + i + ": " + array2[i]);
        }
    }
}