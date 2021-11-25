package ro.uvt.sabloane.Lab5.models;

import java.util.*;

public class Book extends Section {
    //private final String title;
    private final Collection<Author> authors = new LinkedList<>();
    private List<Chapter> chapterList = new ArrayList<>();
    private ArrayList<Element> content = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void  removeAuthor(Author author) {
        authors.remove(author);
    }

    public int createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapterList.add(chapter);
        return chapterList.size();
    }

    public Chapter getChapter(int index) {
        return chapterList.get(index);
    }

    public Collection<Author> getAuthors() {
        return Collections.unmodifiableCollection(authors);
    }

    public void print() {
        System.out.println(this.toString());
        //super.print();
    }

    @Override
    public String toString() {
        return  "Book with name: " + super.getName();

    }

    public void addConent(Element e) {
        this.content.add(e);
    }

    public void add(Section playboy) {

    }
}
