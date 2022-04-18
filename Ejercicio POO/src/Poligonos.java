public abstract class Poligonos {
    protected int numeroLados;
    //Inicializar el constructor (con el unico elemento que tenemos)
    public Poligonos(int numeroLados) {
        this.numeroLados = numeroLados;
    }
    //Insertar Metodo getter

    public int getNumeroLados() {
        return numeroLados;
    }
    //Metodo toString = mostrar datos
    //Override; sobreescribiendo el to String por que
    //esta herdandose


    @Override
    public String toString() {
        return "Numero Lados= " + numeroLados +
                '}';
    }
    //Declaramos el metodo Area como Abstracto
    //Asi las clases hijas lo implementaran
    // Poner la clase poligono como abstracto

    public abstract double area();
}
