package epsi.archi.loc;

import java.util.Collections;
import java.util.List;

public class MovieStorageInMemory {

    private List<Movie> movies;
    public MovieStorageInMemory() { movies = new ArrayList<>(); }
    public List<Movie> list() {
        return Collections.unmodifiableList(movies);
    }

    public void add(Movie movie) {
        movies.add(movie);
    }

    public Movie get(final String exploitationNumber) {
        return movies.stream().filter( m-> m.getExploitation().equals(exploitationNumber)).findFirst()
    }

    public Movie remove()
}
