package books;

import java.util.Arrays;
import java.util.List;

public class PlacesOfPublication {
private String placeOfOrigin;
private List<String> placesOfTranslations;

    @Override
    public String toString() {
        return "PlacesOfPublication{" +
                "placeOfOrigin='" + placeOfOrigin + '\'' +
                ", placesOfTranslations=" + placesOfTranslations +
                '}';
    }

    public PlacesOfPublication(String placeOfOrigin, String... placesOfTranslations) {
        this.placeOfOrigin = placeOfOrigin;
        this.placesOfTranslations = Arrays.asList(placesOfTranslations);
    }
}
