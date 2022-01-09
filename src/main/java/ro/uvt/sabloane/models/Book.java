package ro.uvt.sabloane.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
public class Book extends Section implements Visitee{

    @ManyToMany
    private List<Author> authors_ = new ArrayList<>();


    public Book(String title) {
        super(title);
    }

    public Book() {
        super();
    }

    public Collection<Author> getAuthors(){
        return Collections.unmodifiableCollection(authors_);
    }


    public void addAuthor(Author author){
        authors_.add(author);
    }

    public void removeAuthor(Author author){
        authors_.remove(author);
    }


    @Override
    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }

}
