public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("\t Figuras Geometricas");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Figura\t\t\tArea");
        //creamos las figuras e ingresamos datos para calcular el area de cada figura y imprimimos el resultado
        //en forma de tabla
        Circulo circulo = new Circulo("Circulo", 23.6);
        System.out.println("" + circulo.getNombre() + "\t\t\t" + circulo.calcularArea());
        Rectangulo rectangulo = new Rectangulo("Rectangulo", 45, 12);
        System.out.println("" + rectangulo.getNombre() + "\t\t" + rectangulo.calcularArea());
        Triangulo triangulo = new Triangulo("Triangulo", 67, 45);
        System.out.println("" + triangulo.getNombre() + "\t\t" + triangulo.calcularArea());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
