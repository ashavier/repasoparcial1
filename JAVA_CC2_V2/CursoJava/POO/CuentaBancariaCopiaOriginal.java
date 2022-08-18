
public class CuentaBancariaCopiaOriginal{
    
    //Campos son las variables
    String nombre; //"zxw"
    String numeroCuenta; //"abc"
    double saldo; //3.141627
    char tipo; //'a'

    //Constructores es lo que se utiliza para crear el objeto.
    public CuentaBancariaCopiaOriginal(String nom, String cta, char t){
        nombre = nom;
        numeroCuenta = cta;
        tipo = t;
        saldo =0.0;
        
    }
    public CuentaBancariaCopiaOriginal(String nom, String cta, char t, double sal){
        nombre = nom;
        numeroCuenta = cta;
        tipo = t;
        saldo = sal;  
    }
}