//creamos la clase Triangulo que hereda de la clase padre FiguraGeomterica
public class Triangulo extends FiguraGeometrica {
    //atributos unicos de la clase Triangulo
    private double baseTriangulo;
    private double alturaTriangulo;
    public Triangulo(String nombre, double baseTriangulo, double alturaTriangulo) {
        //hereda de la clase padre el atributo nombre
        super(nombre);
        this.alturaTriangulo = alturaTriangulo;
        this.baseTriangulo = baseTriangulo;
    }
    //se sobreescribe el metodo calcularArea del metodo padre
    @Override
    public double calcularArea() {
        //realizamos la operacion para calcular el area del triangulo
        return 0.5 * baseTriangulo * alturaTriangulo;

    }
}
