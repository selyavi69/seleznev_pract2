
import java.util.Scanner;
public class TestShop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количетсво компьютеров:");
        int n = scanner.nextInt();

        Shop shop = new Shop(n);

        for( int i=0;i<n;i++){

            System.out.println("Введите название компьютера:");
            String name = scanner.next();

            System.out.println("Введите цену компьютера:");
            double price = scanner.nextDouble();

            Computer computer = new Computer(name,price);

            shop.addComputer(computer);
        }

        System.out.print(" Компьютеры в магазине:");
        shop.showComputers();

        System.out.print("\n Введите название компьютера для поиска в магазине:");
        String searchName=scanner.next();

        Computer found = shop.findComputer(searchName);

        if (found!= null){
            System.out.println("Компьютер найден:");
            System.out.println(found);
        } else {
            System.out.println("Компьютер не найден!");
        }

        System.out.print("\n Введите название компьютера для удаления:");
        String deleteName = scanner.next();

        shop.removeComputer(deleteName);

        System.out.print("\n Компьютеры после удаления:");
        shop.showComputers();

    }

}
