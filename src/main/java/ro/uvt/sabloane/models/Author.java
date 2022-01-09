package ro.uvt.sabloane.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author implements Visitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  id;

    private String name;

    private String surname;

    public Author() {

    }

    public Author(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public Author(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitAuthor(this);
    }
}
