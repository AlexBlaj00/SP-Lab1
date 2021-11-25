package ro.uvt.sabloane.Lab5.models;

import ro.uvt.sabloane.Lab5.services.AlignStrategy;
import ro.uvt.sabloane.Lab5.services.Context;

public class Paragraph implements Element {
    private String text;
    AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }



    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this, new Context());
        }
        else {
            System.out.println("Paragraph: " + text);
        }
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy as) {
        this.alignStrategy = as;
    }

    public boolean find(Element e) {
        // TODO Auto-generated method stub
        if (!(e instanceof Paragraph)) {
            return false;
        }
        else {
            return ((Paragraph) e).text.equals(this.text);
        }
    }
}
