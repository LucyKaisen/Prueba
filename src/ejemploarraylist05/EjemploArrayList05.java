package ejemploarraylist05;
import java.util.Scanner;
import java.util.ArrayList;
public class EjemploArrayList05 {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    
    ArrayList<String> a =new ArrayList<String>();
    a.add("rosa");
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");
    
        System.out.println("Contenido:");
        
        for(String color: a)
       System.out.println(color);
        
        a.set(2, "turquesa");
        System.out.println("Contenido despues de borrar la posicion 2: ");
        
        for(String color:a){
            System.out.println(color);
        }
 
    }
}
