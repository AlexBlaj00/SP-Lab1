package ro.uvt.sabloane.Lab6.models;


import java.util.Objects;

public class Author {
    private final String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void accept(Visitor visitor){
        visitor.visitAuthor(this);
    }
}
