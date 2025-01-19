public class Main {
    public static void main(String[] args) {
        // Crear una matriz de formas (Shapes)
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(10, 5);
        shapes[1] = new Triangle(10, 5);
        shapes[2] = new Circle(7);

        // Calcular y mostrar el área de cada forma
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + " surface: " + shapes[i].calculateSurface());
        }
    }
}