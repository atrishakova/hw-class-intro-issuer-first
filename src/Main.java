public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", 1966, "Михаил Булгаков", 528);
        Book book2 = new Book("Война и мир", 1867, "Лев Толстой", 2144);
        Book book3 = new Book("Сказка о золотом петушке", 1834, "Александр Пушкин", 32);

        System.out.println(book1);
        System.out.println("Книга большая? " + (book1.isBig() ? "Да" : "Нет"));
        System.out.println("Книга содержит \"мастер\"? " + (book1.matches("мастер") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"Булгаков\"? " + (book1.matches("Булгаков") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"велосипед\"? " + (book1.matches("велосипед") ? "Да" : "Нет"));
        System.out.println("Оценка стоимости книги: " + book1.estimatePrice() + " руб.");

        System.out.println();

        System.out.println(book2);
        System.out.println("Книга большая? " + (book2.isBig() ? "Да" : "Нет"));
        System.out.println("Книга содержит \"Война\"? " + (book2.matches("Война") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"Толстой\"? " + (book2.matches("Толстой") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"велосипед\"? " + (book2.matches("велосипед") ? "Да" : "Нет"));
        System.out.println("Оценка стоимости книги: " + book2.estimatePrice() + " руб.");

        System.out.println();

        System.out.println(book3);
        System.out.println("Книга большая? " + (book3.isBig() ? "Да" : "Нет"));
        System.out.println("Книга содержит \"золотом\"? " + (book3.matches("золотом") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"Пушкин\"? " + (book3.matches("Пушкин") ? "Да" : "Нет"));
        System.out.println("Книга содержит \"велосипед\"? " + (book3.matches("велосипед") ? "Да" : "Нет"));
        System.out.println("Оценка стоимости книги: " + book3.estimatePrice() + " руб.");
    }
}
