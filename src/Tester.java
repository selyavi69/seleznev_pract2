public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size){
        circles = new Circle[size];
        count=0;
    }

    public static void main(String[] args){

        Tester tester= new Tester(5);

        Point p1 = new Point(2,6);
        Point p2 = new Point(10,5);

        Circle c1= new Circle(p1,5);
        Circle c2= new Circle(p2,10);

        tester.circles[0]=c1;
        tester.circles[1]=c2;

        tester.count=2;

        System.out.println("Количесвто окружностей:" + tester.count);

        System.out.println("Окружность 1:"+ tester.circles[0]);
        System.out.println("Окружность 2:" + tester.circles[1] );

    }

}
