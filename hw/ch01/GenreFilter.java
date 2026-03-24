
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilter implements Iterator<Book> {
    private final BookShelf bookShelf;
    private String genre;
    private int index;
    private Book nextBook;

    public GenreFilter(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
        advance();
    }

    private void advance() {
        nextBook = null;
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index++);
            if (book.getGenre().equals(genre)) {
                nextBook = book;
                break;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return nextBook != null;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book result = nextBook;
        advance();
        return result;
    }
}