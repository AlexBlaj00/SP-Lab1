package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
    private final String name;
    private List<Element> elementList = new ArrayList<>();


    public Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Section{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void add(Element e)  {
        elementList.add(e);
    }


    public Element get(int e) {
        return elementList.get(e);
    }

    public void remove(Element e) {
        elementList.remove(e);
    }


    public boolean find(Element e) {
        return false;
    }
}
