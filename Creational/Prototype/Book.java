package Creational.Prototype;

public class Book extends Item {
    
    private int numberOfPages;

    public Book() {
    }

    public Book(Book book) { 
        super(book);
        if(book != null) {
            this.numberOfPages = book.numberOfPages;
        }
    }

    @Override
    public Item clone() {
        return new Book(this);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
