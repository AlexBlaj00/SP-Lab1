package ro.uvt.sabloane.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
public class Section extends BaseElement implements Visitee {


    protected String title_;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = BaseElement.class)

    private List<Element> elements = new ArrayList<>();

    public Section(String title_){
        this.title_ = title_;
    }

    public Section() {

    }


    public String getTitle() {
        return title_;
    }

    public void setTitle_(String title_) {
        this.title_ = title_;
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.add(element);
    }

    @Override
    public Element get(Integer index) {
        return elements.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }
}
