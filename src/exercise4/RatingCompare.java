package exercise4;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        if (left.getRating() > right.getRating()) {
            return 1;
        } else if (left.getRating() == right.getRating()) {
            return 0;
        } else {
            return -1;
        }
    }
}
