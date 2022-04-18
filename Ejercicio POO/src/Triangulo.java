public class Triangulo  extends Poligonos{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    //Getters

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }
    //Llamar de nuevo a toString de la clase padre

    @Override
    public String toString() {
        return "Triangulo: \n" +
                super.toString()+
                "\nlado1= " + lado1 +
                ", lado2= " + lado2 +
                ", lado3= " + lado3 +
                '}';
    }
    //Obtener el Area del triangulo
    //override de la clase padre para de nuevo hacer la clase abstracta
    public double area(){
        double p = (lado1+lado2+lado3)/2;
        return Math.sqrt((p*(p-lado1)*(p-lado2)*(p-lado3)));

    }
}
