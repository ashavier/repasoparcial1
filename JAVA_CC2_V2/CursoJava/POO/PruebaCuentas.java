
//Solamente se debe de ejecutar el que tenga el main 
//Que este como se crea el objeto va a llamar a la clase de cuenta bancaria.
public class PruebaCuentas{
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria("JP", "123", 'm');
        CuentaBancaria c2 = new CuentaBancaria("toto", "13", 'T', 100000);//Siempre se debe de declarar de la manera que se escribio el codigo con anterioridad.
        
        System.out.println("Nombre cuenta uno: "+ c1.getNombre()); //Aqui ya es un metodo por eso los parentesis
        System.out.printf("Nombre cuentra dos: %s\n", c2.getNombre());

        System.out.println("\nSaldop de la cuenta uno: "+ c1.getSaldo());
        System.out.printf("Saldo de la cuenta dos: %.2f\n", c2.getSaldo());

        //c1.setSaldo(4500.00); Con el set solamente lo eliminamos completamente 
        //Con esto es mejor hacer metodos que nos ayuden

        c1.depositar(100);
        System.out.println("\nSaldop de la cuenta uno: "+ c1.getSaldo());
  
        
        c1.retirar(50);

        System.out.println("\nSaldop de la cuenta uno: "+ c1.getSaldo());

        System.out.println("EL toString: "+ c1.toString());
        System.out.println("\nEL toString: "+ c2.toString());

        //c1.nombre.equals(c2.nombre);

    }



}