
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("202407972 윤경하");
        System.out.println("               ");


        BookShelf bookShelf = new BookShelf(20);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        System.out.println("소설 장르 도서");
        System.out.println("===============================");
        System.out.print(String.format("%-25s / %4s / %4s / %6s", "제목", "장르", "출판년도", "가격"));
        System.out.println();
        System.out.println("===============================");

        Iterator<Book> gIterator = bookShelf.iteratorByGenre("소설");
        while (gIterator.hasNext()) {
            System.out.println(gIterator.next());
        }
        System.out.println("===============================");

        System.out.println("출판년도 순 도서");
        System.out.println("===============================");
        System.out.print(String.format("%-25s / %4s / %4s / %6s", "제목", "장르", "출판년도", "가격"));
        System.out.println();
        System.out.println("===============================");
        Iterator<Book> yIterator = bookShelf.iteratorByYear();
        while (yIterator.hasNext()) {
            System.out.println(yIterator.next());
        }
        System.out.println("===============================");
    }
}
