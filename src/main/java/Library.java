import java.util.ArrayList;

public class Library {

    ArrayList<Book> stock;
    int capacity;

    public Library(int capacity) {
        this.stock = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCheck(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (stockCheck() < this.capacity) {
            this.stock.add(book);
        }
    }

    public Book removeBook(Book book){
        this.stock.remove(book);
        return book;
    }
}
