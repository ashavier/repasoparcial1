

public class Fraccion{

    //Campos
    private int numerador;
    private int denominador;

    //Constructores
    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        if(denominador ==0){
            denominador = 1; //Solamente se esta cambniando el parametro 
        } 
        this.denominador = denominador; //Aqui se cambia el campo
    }

    public Fraccion(int numerador){
        //this.numerador = numerador;
        //denominador = 1;
        //Lo de arriba es lo mismo que abajo.
        this(numerador, 1);
    }

    //Metodo Getter
    public int getNum(){
        return this.numerador;
    }

    public int getDen(){
        return this.denominador;
    }

    //Metodo Setter

    public void setNumerador(int num){
        this.numerador = num;
    }

    public void setDenominador(int den){
        this.denominador = den;
    }

    public void simplify(){
        int m = mfc(this.numerador, this.denominador);
        //this.numerador = this.numerador / m;
        //Es lo mismo que

        this.numerador /= m;
        this.denominador /= m;



    }
    //sumar dos metodos
    public Fraccion add(Fraccion otra){
        /*
        f1.add(f2);
        f1 ==this
        f2 ==otra
         
        a/b + c/d = ad+bc/bd

            this + otra
            a =this.numerador
            b =this.denominador
            c=otra.numerador
            d = otra.denominador 
        */

        int nuevoDen = (this.denominador *otra.denominador);
        int nuevoNum = (this.numerador * otra.denominador) + (this.denominador *otra.numerador);

        //Creo una nueva fraccion con estos valores

        Fraccion res = new Fraccion(nuevoNum, nuevoDen);
        res.simplify();
        return res;
    }

    public boolean equials(Fraccion otra){
        //this ==otra
        if(this.numerador == otra.numerador && this.denominador == otra.denominador){
            return true;
        }
        return false;

    }

    //Crear un metodo de maximo comun divisor

    //esto es para sacar el maximo comun divisor
    private static int mfc(int a, int b){
        if(b ==0){
            return a;
        } else{
            return mfc(b,a % b);
        }

    }

    @Override 
    public String toString(){
        return String.format("%s /%s", this.numerador, this.denominador);

    }








}

