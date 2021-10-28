package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + this.text);
    }


}
