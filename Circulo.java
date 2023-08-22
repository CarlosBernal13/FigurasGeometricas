//creamos la clase Circulo que hereda de la clase padre FiguraGeomterica
class Circulo extends FiguraGeometrica {
    //atributos unicos de la clase Circulo
    private double radio;
    public Circulo(String nombre, double radio){
        //hereda de la clase padre el atributo nombre
        super(nombre);
        this.radio=radio;
    }
    //se sobreescribe el metodo calcularArea del metodo padre
    @Override
    public double calcularArea(){
        //realizamos la operacion para calcular el area del circulo
       return Math.PI*radio*radio;
    }
}
