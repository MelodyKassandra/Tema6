package A_Atributos;
/*A1. Crea un programa con una clase llamada Punto que representará un punto de dos
dimensiones en un plano. Solo contendrá dos atributos enteros llamadas x e y
(coordenadas).
En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0),
(10,10) y (-3, 7). Muestra por pantalla sus coordenadas (utiliza un println para cada
punto). Modifica todas las coordenadas (prueba distintos operadores como = + - +=
*=...) y vuelve a imprimirlas por pantalla. */

//Creamos la clase Punto que contendrá todos los atributos y métodos, modificaciones y operaciones
class Punto{
    //Definimos atributos para reprensenat coordenadas x e y
    String nombre;
    int x, y;

    //Constructor para inicializar el punto
    public Punto(int x, int y){
        this.x= x;
        this.y= y;
    }

    //Método para mostrar las coordenadas del punto
    public void mostrarCoordenadas(){
        System.out.println("Punto ("+x+", "+y+")");
    }

    //Método para modificar las coordenadas
    public void modificarCoordendas (int nuevoX, int nuevoY){
        this.x = nuevoX;
        this.y = nuevoY;
    }

    //Método para aplicar operaciones a las coordenadas
    public void operarCoordenadas (int valor){
        this.x += valor;
        this.y += valor;
    }
}

//El nombre del fichero debe coindicir siempre con el nombre de la clase pública que contenga el método main
//Clase principal y ejecutable que contiene la creación de nuevos objetos, impresión de valores iniciales/finales, moficiación...
public class EjercicioA1{
    public static void main(String[] args) {
        //Instanciar tres objetos punto con las coordenadas dadas
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3= new Punto (-3,7);

        //Mostrar coordendas iniciales
        System.out.println("Coordendas iniciales:");
        punto1.mostrarCoordenadas();
        punto2.mostrarCoordenadas();
        punto3.mostrarCoordenadas();

        //Mostrar mensaje por pantalla modificando las coordenadas
        System.out.println("Modificando coordenadas...");

        //Usar método modificar para modificar las coordendas correctamente
        punto1.modificarCoordendas(3, 4);
        punto2.x= punto2.x -5; //Resta 5 a la coordenada x
        punto3.y*= 2; //multiplica la coordenada y *2

        //Mostrar coordenadas modificadas
        System.out.println("\nCoordendas modificadas:");
        punto1.mostrarCoordenadas();
        punto2.mostrarCoordenadas();
        punto3.mostrarCoordenadas();

        //Aplicar más operaciones a las coordenadas
        System.out.println("Aplicando operaciones adicionales...");
        punto1.operarCoordenadas(2); //Suma 2 a x y multiplica y*2
        punto2.operarCoordenadas(3); //Suma 3 a x y multiplica y*3
        punto3.operarCoordenadas(-1); //suma -1 a x y multiplica x*-1

        //Mostrar coordendas finales
        System.out.println("\nCoordenadas finales:");
        punto1.mostrarCoordenadas();
        punto2.mostrarCoordenadas();
        punto3.mostrarCoordenadas();
    }
}