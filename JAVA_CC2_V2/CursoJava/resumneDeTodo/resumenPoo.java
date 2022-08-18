//se desea separar parte del codigo 
//es dividir codigo para tener una mejor organizacion. 
public class resumenPoo{
    public static void main(String[] args){
        Perro perrito = new Perro(); 
        //Perro nombre de la calse
        //perrito es una variable es para acceder a los metodos de la clase. 
        perrito.ladrar();//se lllama al metodo. 

    }
    public class Perro{
        //metodos que se necesitan usar en otra clase 
        public void ladrar(){
            System.out.println("Guau");
        }
    }
}

