package books;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String... args) {
    //docelowo wyswietlic wszystkie
        // ksiazki autora wg roku wydania a ksiazki
        // wg miejsca wydania alfabetycznie

        Author komudaJacek = new Author();
        List<Book> listOfBooks2000 = new ArrayList<>();
        PlacesOfPublication placeOfPublications =
                new PlacesOfPublication("Poland",
                        "Czech","Russia","Ukraine");

        Set<TypeOfBook> typeOfBookHashSet = new HashSet<>();
        typeOfBookHashSet.add(TypeOfBook.COMEDY);
        typeOfBookHashSet.add(TypeOfBook.ROMANCE);

        Book firstBook = new Book(2000,
                typeOfBookHashSet,"TitleOne", placeOfPublications);

        listOfBooks2000.add(firstBook);
        komudaJacek.mapOfBooks.put(2000,listOfBooks2000);


        System.out.println(komudaJacek.mapOfBooks.get(2000));




    }

}
