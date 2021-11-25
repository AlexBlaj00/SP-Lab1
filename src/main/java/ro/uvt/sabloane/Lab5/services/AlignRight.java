package ro.uvt.sabloane.Lab5.services;


import ro.uvt.sabloane.Lab5.models.Paragraph;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getText() + " align right");
    }
}
