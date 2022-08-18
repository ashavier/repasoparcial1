import java.io.*;


public class ingresoDatosBuffered{
    public static void main(String[] args) throws Exception{ 
        /* InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr); */
        //Se resume en
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Por favor ingresa tu variable: ");
        String linea = tec.readLine();
        System.out.println(linea);


    }

}

