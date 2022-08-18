

public class Test{
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(4, 5);
        Fraccion f2 = new Fraccion(2, 5);
        System.out.println("f1: "+ f1.toString());
        System.out.println("f2: "+ f2.toString());

        f1.simplify();
        f2.simplify();

        System.out.println("\nf1: "+ f1.toString());
        System.out.println("f2: "+ f2.toString());

        
        System.out.println("\nSuma: "+ f1.add(f2));
    }

}