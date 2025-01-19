public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super(radius, radius); // Altura y ancho se inicializan con el radio
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.width = radius;
        this.height = radius;
    }
}

