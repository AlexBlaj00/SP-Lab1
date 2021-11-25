package ro.uvt.sabloane.Lab5.models;

import java.util.ArrayList;
import java.util.Collection;

public class SubChapter {

    private String name;
    private Collection<Element> elements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Subchapter: " + this.name);
        for( Element e : elements) {
            e.print();
        }
    }

    public void createNewTable(String title) {
        elements.add(new Table(title));
    }

    public void createNewParagraph(String text) {
        elements.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        elements.add(new Image(imageName));
    }



}