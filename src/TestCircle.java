public class TestCircle {

    public static void main(String[] args){


        Circle6 circle1 = new Circle6(10);

        System.out.println("Радиус1:" + circle1.getRadius());

        circle1.setRadius(5);

        System.out.println("Новый радиус1: " + circle1.getRadius());

        System.out.println("Площадь1: " + circle1.getArea());

        System.out.println("Длина окружности1: " + circle1.getLength());

        Circle6 circle2 = new Circle6(5);

        System.out.println("Радиус2:" + circle2.getRadius());

        int result = circle1.comparing(circle2);

        if (result>0){
            System.out.println("Первая окружность больше второй!");
        } else if (result<0){
            System.out.println("Первая окружность меньше второй!");
        } else{
            System.out.println("Окружности 1 и 2 равны!");
        }
    }
}
