public class Book {
    private String name;
    private String genre;
    private int year;
    private double price;

    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-25s / %4s / %4d / %,6.0f", name, genre, year, price);
    }
}
