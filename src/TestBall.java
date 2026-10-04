public class TestBall {
    public static void main(String[] args){
        // Создаем мяс с координатами (5,10)
        Ball ball = new Ball(5,10);
        // Проверка сохранения значений в x и y)
        System.out.println("Изначальный X:"+ ball.getX());
        System.out.println("Изначальный Y:"+ ball.getY());
        // Проверка изменения координат
        ball.setX(15);
        ball.setY(25);
        System.out.println("После setX и setY: " + ball);

        ball.setXY(25,25);
        System.out.println("Изменение сразу двух координат XY одновременно:"+ ball);

        // Проверка перемещения мяча
        ball.move(-10,9);
        System.out.println("После move координат:"+ ball);

        // Проверка конструктор без параметров
        Ball ball2 = new Ball();
        System.out.println("Без ввода параметров:"+ ball2);

    }
}
