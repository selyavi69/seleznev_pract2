public class Task8 {
    public static void main(String[] args) {

        String[] array = {"Один", "Два", "Три", "Четыре", "Пять"};

        System.out.println("Исходный массив: ");

        for (String s : array) {
            System.out.print(s + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {

            String temp = array[i];

            array[i] = array[array.length - 1 - i];

            array[array.length - 1 - i] = temp;
        }

        System.out.println("\n\nМассив после переворота:");

        for (String s: array){
            System.out.print(s + " ");
        }
    }
}