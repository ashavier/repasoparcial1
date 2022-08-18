

public class prueba{
    public static void main(String[] args){
        try {
            Runtime.getRuntime().exec("clear");
        } catch(IOException e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }

}  