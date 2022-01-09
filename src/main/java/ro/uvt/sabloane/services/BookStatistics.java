package ro.uvt.sabloane.services;


import ro.uvt.sabloane.models.*;
import ro.uvt.sabloane.models.TableOfContents;

import java.util.HashMap;
import java.util.Map;

public class BookStatistics implements Visitor<Void> {

    Map<String, Integer> stats = new HashMap<>();

    public void printStatistics(){
        for (String key: stats.keySet()){
            System.out.println(key + " - " + stats.get(key));
        }
    }
    @Override
    public Void visitBook(Book book) {
        if (stats.containsKey("book")){
            stats.put("book", stats.get("book") + 1);
        }else{
            stats.put("book",1);
        }
        for (Author a : book.getAuthors()){
            a.accept(this);
        }
        for (Element e : book.getElements()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents tableOfContents) {
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        return null;
    }
}
