package ro.uvt.sabloane;

import ro.uvt.sabloane.Author;

import java.util.*;


public class Book {

    private final String title;
    private Collection<Author> authors = new LinkedList<>();
    private List<Chapter> chapterList = new ArrayList<>();


    public Book(String title) {
        this.title = title;
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
        return  authors;
    }

    public void print() {
        System.out.println(this.title);
        for(Author author: authors) {
            author.print();
        }

        for(Chapter chapter: chapterList) {
            chapter.print();
        }
    }



    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                '}';
    }
}
