import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {
    static ArrayList<Poligonos> poligono = new ArrayList<Poligonos>();
    static Scanner entrada = new Scanner(System.in);
    //El arreglo Dinamico nos ayuda para no indicar en un principio
    //cuantos elementos va a tener
    //Crear un arreglo dinamico
        /*Creando mas metodos estaticos nos ayuda aque no todos los
        procesos queden dentro del main y sea mas dinamico o desarraigado*/
//Colocar la parte de la entrada donde el usuario colocara el poligono ( entrada)

    public static void main(String [] args) {
        //Poniendo un Poligono
        //Creamos un metodo publico
        ponerPoligono();
        //Para mostrar los datos del area


    }

        public static void ponerPoligono(){
            char respuesta;
            int opcion;
            do {
                do {

                    System.out.println("Digite el poligono que desee");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("Opcion: ");
                    opcion = entrada.nextInt();
                }while (opcion<1 || opcion>2);

                switch (opcion) {
                    case 1: llenadoTriangulo();//Poner Triangulo
                        break;
                    case 2: llenadoRectangulo();//Rectangulo
                        break;
                }

                System.out.print("\nIntrodusca otro Poligono si asi lo desea(s/n)): ");
                respuesta = entrada.next().charAt(0);
                System.out.println("");

            }while (respuesta=='s' || respuesta=='S');

        //Para meter mas poligonos al programa metemos do y while
            //Una vez creada la respuesta poner el elemento ponerPoligono
        }
        //Resolver el caso 1 y 2 declaramos un metodo
        public static void llenadoTriangulo(){
            double lado1,lado2,lado3;

            System.out.println("\nDigite el lado1 del Triangulo");
            lado1 = entrada.nextDouble();
            System.out.println("Digite el lado2 del Triangulo");
            lado2 = entrada.nextDouble();
            System.out.println("Digite el lado3 del Triangulo");
            lado3 = entrada.nextDouble();

            //Polimorfismo
            //Se puede guardar un objeto de la clase triangulo dentro
            //de un objeto de la clase poligono

            Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
            //Guardamos un triangulo dentro del arreglo de poligonos

            poligono.add(triangulo);

        }
        //Hacer lo mismo para el rectangulo
        public static void llenadoRectangulo(){
        double lado1,lado2;
            System.out.println("\nDigite el lado1 del Rectangulo");
            lado1 = entrada.nextDouble();
            System.out.println("Digite el lado2 del Rectangulo");
            lado2 = entrada.nextDouble();

            Rectangulo rectangulo = new Rectangulo(lado1, lado2);
            poligono.add(rectangulo);

        }
        public static void mostrarResultados(){
        for (Poligonos poli: poligono){
            System.out.println(poli.toString());
            System.out.println("Area= "+poli.area());
            System.out.println("");
        }


    }


}




//Una clase Abstracta no puede instanciarse
//Solo se pueden instanciar sus clases hij@s