package books;

import java.util.Set;

public class Book {
private int yearOfPublication;
private Set<TypeOfBook> type;
private String title;
private PlacesOfPublication placesOfPublication;

    public Book(int yearOfPublication, Set<TypeOfBook> type,
                String title, PlacesOfPublication placesOfPublication) {
        this.yearOfPublication = yearOfPublication;
        this.type = type;
        this.title = title;
        this.placesOfPublication = placesOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "yearOfPublication=" + yearOfPublication +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", placesOfPublication=" + placesOfPublication +
                '}';
    }
}
