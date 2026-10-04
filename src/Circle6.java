public class Circle6 {
    private double radius;

    public Circle6(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public int comparing(Circle6 other) {
        if ( this.radius > other.radius){
            return 1;
        } else if (this.radius < other.radius){
            return -1;
        } else {
            return 0;
        }
    }
}

