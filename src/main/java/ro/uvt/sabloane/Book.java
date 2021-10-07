package ro.uvt.sabloane;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Book {
    private final Collection<Author> authors = new LinkedList<>();
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void  removeAuthor(Author author) {
        authors.remove(author);
    }

    public Collection<Author> getAuthors() {
        return Collections.unmodifiableCollection(authors);
    }
}
