package ro.uvt.sabloane;


public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getText() + " align right");
    }
}
