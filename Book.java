package Library;

class Book {

    String author;
    String title;
    int numOfPages;

    public Book(String author, String title, int numOfPages) {

        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;

    }

    public String getAuthor() {

        return author;

    }

    public String getTitle() {

        return title;

    }
}

