package ro.uvt.sabloane.models;


import javax.persistence.Entity;
import java.util.Objects;
@Entity(name = "Tabel")
public class Table extends BaseElement implements Visitee {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public Table() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }

}
