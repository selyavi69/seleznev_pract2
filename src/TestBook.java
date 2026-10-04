public class TestBook {
    public static void main(String[] args){
        Book book = new Book("Лев Толстой", "Война и мир", 1869);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название: " + book.getTitle());
        System.out.println("Год: " + book.getYear());

        book.setAuthor("Александр Пушкин");
        book.setTitle("Евгений Онегин");
        book.setYear(1833);

        System.out.println("\nПосле изменения данных:");

        System.out.println("Новый автор: " + book.getAuthor());
        System.out.println("Новое название: " + book.getTitle());
        System.out.println("Новый год: " + book.getYear());

        System.out.println("\n Описание книги:");
        System.out.println(book);
    }
}
