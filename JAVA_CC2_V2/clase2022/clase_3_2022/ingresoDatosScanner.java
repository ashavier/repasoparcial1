import java.util.*;


public class ingresoDatosScanner{
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);
        System.out.print("Por favor ingrese el valor: ");
        String  val = tec.nextLine();
        System.out.println("El resultado es: "+ val);
    }
}