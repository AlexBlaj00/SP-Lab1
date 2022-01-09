package ro.uvt.sabloane.models;


import javax.persistence.Entity;
import java.util.Objects;
@Entity
public class TableOfContents extends BaseElement implements Visitee {
    private final String title_;

    public TableOfContents(String title)
    {
        title_ = title;
    }

    public TableOfContents(TableOfContents tableOfContents)
    {
        title_ = tableOfContents.title_;
    }



    public TableOfContents() {
        this("");
    }

    public String getTitle() { return title_; }

    @Override
    public void add(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public void remove(Element element)
    {
        throw new UnsupportedOperationException();
    };


    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }

}
