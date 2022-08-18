
public class CuentaBancaria{
    //Se tiene que tomar en cuanta cuales son los valores que no se deben de ingresar el usuario para que no sea admitido la alteracion del valor.  c
    
    //Campos son las variables
    private String nombre; //"zxw"
    private String numeroCuenta; //"abc"
    private double saldo; //3.141627
    private char tipo; //'a'
    //Si esta en private ya no se puede acceder al campo como se desa ingresar. 



    //Constructores es lo que se utiliza para crear el objeto.
    public CuentaBancaria(String nombre, String numeroCuenta, char tipo){
        this.nombre = nombre; 
        this.numeroCuenta = numeroCuenta;        
        this.tipo = tipo;
        this.saldo =0.0;
        //this(nombre, numeroCuenta, tipo, 0.0);
        //Esto es para duplicar codigo para que se envie de una mejor manera. 
        
    }
    public CuentaBancaria(String nombre, String numeroCuenta, char tipo, double saldo){
        this.nombre = nombre; 
        this.numeroCuenta = numeroCuenta;        
        this.tipo = tipo;
        this.saldo = saldo; 
    }
    //Declaracion de un metodo esta compuesto de varias cosas.
    /*
    -Tipo
    -Nombre
    - Lista de parametros 
    Este congunto de cosas se le llama la firma de un metodo.
    */

    //Metodos
    //Modificador de acceso tipo nombre(params)
    
    //Getter
    //Son funciones por que tienen un valor de retorno
    public String getNombre(){
       return this.nombre; 
    }

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public char getTipo(){
        return this.tipo;
    }

    //Setter
    //void no tiene valo r de retorno por eso es un procedimiento.
    /*    
    public void setSaldo(double s){ //debemos de indicar el imput
        saldo =s;
        //solamente el void hace el cambio no lo muestra de una manera detallada. 
    }
    public void setNumeroCuenta(String n){
        numeroCuenta = n;
    }
    */

    //metodos creados
    public boolean dispoible(double cantidad){
        if(cantidad <= this.saldo){
            return true;
        }else{
            return false;
        }
    }
    
    public void depositar(double monto){
        if(monto >0){
            this.saldo += monto;
        }else{
            System.out.printf("El monto %.2f es invalido para el deposito\n", monto);
        }
    }

    public void retirar(double monto){
        if(monto >0 && monto <=saldo){ // && this.dispoible(monto)
            this.saldo -= monto;
        }else{
            System.out.printf("El monto %.2f es invalido para el retiro\n", monto);
        }  
    }



    //Override significa sobrescribir el metodo
    /*
    Sobreescribir un metodo:
    Darle una nueva implementacion al metodo a una clase hija.

    //hasCode identificador unico de un obnjeto.

    */
    //Las anotaciones son como etiquetas

    public boolean equals(CuentaBancaria otra){
        //this == otra
        //ESto compara una con la otra. 
        if(this.numeroCuenta.equals(otra.numeroCuenta) 
        && this.nombre.equals(otra.nombre) 
        && this.tipo == otra.tipo 
        && this.saldo == otra.saldo){
            return true;
        }else{
            return false;
        }
        //Si eliminamos el else solo ponermos 
        //return false

    }

    @Override //Esto se una ayuda al momento de compilar 
    //Para poder verificar que si se esta sobrescribiendo el metodo, si esta bien escrito, es para evitar confundirnos. 
    public String toString(){
        //No se debe de poner ningun tipo de print()!!!
        //Construir un string sin imprimrilo
        //Tambien se puede mostrar sin mas o crear una variable y retornarlo con eso. 

        return String.format("\n-Nombre [%s]\n-Cuenta: [%s]\n-Saldo: [%.2f]\n-Tipo: [%s]",this.nombre, this.numeroCuenta, this.saldo, this.tipo);
    
    }


    /*ANOTACIONES PARA THIS
      This se utiliza dentro de la definicion de una clase y hace referencia al objeto 
      al que se le aplicara el metodo o al objeto que se esta construyendose.

      Caso #1 
        Cuando nombramos algun parametro igual a un campo de la clase, y 
        debemos utilizar ambos en el metodo o constructor.
        Utilizamos this para referirnos a el campo de este objeto.
        ESto es lo que se realizao en el constructor con el this.

      Caso #2
        Cuando queremos aplciar un metodo internamente al mismo obnjetoi
        que estamos utilizando, es decir, al objeto sobre el cual se mando 
        a llamar la accion oritginalemtne.
        Ir a la linea 69 en los metodos creados 
      
      Caso #3
        This tambnien se puede usar par ahacer referncia a un cosntructor 
        de la misma clase y asi evitar duplicar codigo.


    */
    /*\
     El metodo equals pertenece para comparar dos objetos. 
    */


}