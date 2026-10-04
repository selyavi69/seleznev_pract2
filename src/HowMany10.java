import java.util.Scanner;

public class HowMany10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова:");

        String line = scanner.nextLine();

        if ( line.trim().isEmpty() || line.trim().matches("\\d+")){
            System.out.println("Количество слов: 0");
            return;
        }

        String[] words = line.trim().split("\\s+");

        System.out.println("Количество слов:" +  words.length);
    }
}
