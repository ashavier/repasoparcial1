
//Solamente se debe de ejecutar el que tenga el main 
//Que este como se crea el objeto va a llamar a la clase de cuenta bancaria.
public class PruebaCuentasCopiaOriginal{
    public static void main(String[] args){
        CuentaBancariaCopiaOriginal c1 = new CuentaBancariaCopiaOriginal("JP", "123", 'm');
        CuentaBancariaCopiaOriginal c2 = new CuentaBancariaCopiaOriginal("toto", "13", 'T', 100000);//Siempre se debe de declarar de la manera que se escribio el codigo con anterioridad.
        
        System.out.println("Nombre cuenta uno: "+ c1.nombre); //solamente es una variabnle
        System.out.printf("Nombre cuentra dos: %s\n", c2.nombre);

        System.out.println("Saldop de la cuenta uno: "+ c1.saldo);
        System.out.printf("Saldo de la cuenta dos: %.2f\n", c2.saldo);

        c1.saldo = 4500.00;

        System.out.println("Saldop de la cuenta uno: "+ c1.saldo);
        System.out.printf("Saldo de la cuenta dos: %.2f\n", c2.saldo);
    }



}