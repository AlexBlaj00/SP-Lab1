package ro.uvt.sabloane;

import java.util.*;

public class Paragraph implements Element {
    private String text;
    AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = new AlignLeft();
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + alignStrategy.align(this.text));
    }


    public void setAlignStrategy(AlignStrategy as) {
        this.alignStrategy = as;
    }
}
