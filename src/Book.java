public class Book {
    final int MAX_PAGES_COUNT = 500;
    final int PRICE_ONE_PAGE = 3;
    final int MIN_AMOUNT_BOOK = 250;

    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book (String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig () {
        return pages >= MAX_PAGES_COUNT;
    }

    public boolean matches (String word) {
        return title.toLowerCase().contains(word.toLowerCase()) || author.toLowerCase().contains(word.toLowerCase());
    }

    public int estimatePrice () {
        int realBookAmount = pages * PRICE_ONE_PAGE;

        return  Math.max(realBookAmount, MIN_AMOUNT_BOOK);
    }

    public String toString () {
        return "\"" + title + "\" (" + author + ", " + releaseYear + "г., " + pages + " стр.)";
    }
}
