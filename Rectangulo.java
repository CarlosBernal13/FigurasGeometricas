//creamos la clase Rectangulo que hereda de la clase padre FiguraGeomterica
class Rectangulo extends FiguraGeometrica{
    //atributos unicos de la clase Rectangulo
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base,double altura){
        //hereda de la clase padre el atributo nombre
        super(nombre);
        this.base=base;
        this.altura=altura;
    }
    //se sobreescribe el metodo calcularArea del metodo padre
    @Override
    public double calcularArea(){
        //realizamos la operacion para calcular el area del rectangulo
        return base*altura;
    }
}