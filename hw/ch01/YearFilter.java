
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearFilter implements Iterator<Book> {
    private Book[] sorted;
    private int index;

    public YearFilter(BookShelf bookShelf) {
    int len = bookShelf.getLength();
    sorted = new Book[len];
    for (int i = 0; i < len; i++) {
        sorted[i] = bookShelf.getBookAt(i);
    }
    Arrays.sort(sorted, (b1, b2) -> {
        if (b1.getYear() != b2.getYear()) {
            return b1.getYear() - b2.getYear();
        }
        return b2.getName().compareTo(b1.getName());
    });
    index = 0;
}

@Override
public boolean hasNext() {
    return index < sorted.length;
}
@Override
public Book next() {
    if (!hasNext()) {
        throw new NoSuchElementException();
    }
    return sorted[index++];

}
}