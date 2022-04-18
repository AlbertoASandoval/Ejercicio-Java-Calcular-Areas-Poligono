public class Rectangulo  extends Poligonos{
    //IMPLEMENTAR LA CLASE ABSTRACTA
    private double lado1;
    private double lado2;
    //Constructor; clase hija
    //Poner que el numero de lados sera solo 2 en la clase Super
    public Rectangulo(int numeroLados, double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    //Getters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }
    //Sobreescribiendo el metodo toString de la clase Padre (Poligonos)
    // Aparte de mostrarnos el lado 1 y 2 nos deberia mostrar el #Lados
    //Agregamos Super y el String de la clase PADRE para que nos lo muestre
    @Override
    public String toString() {
        return "Rectangulo: \n" +
                super.toString()+
                "\nlado1= " + lado1 +
                ",lado2= " + lado2 +
                '}';
    }

    //Metodo Area
    // Algunos de los elementos de la clase poligonos son abstractos
    // Debemos aplicar esa clase abstracta a la clase hijos

    public double area(){
        return lado1*lado2;
    }

}
