package ro.uvt.sabloane.Lab6.services;


import ro.uvt.sabloane.Lab6.models.*;

import java.util.ArrayList;
import java.util.List;

public class BookSaveVisitor implements Visitor<Void> {
    private List<Image> images_;
    private List<ImageProxy> imageProxies_;
    private List<Table> tables_;
    private List<TableOfContents> tableOfContents_;
    private List<Paragraph> paragraphs_;
    private List<Book> books_;
    private List<Author> authors_;
    public BookSaveVisitor()
    {
        images_ = new ArrayList<>();
        imageProxies_ = new ArrayList<>();
        tables_ = new ArrayList<>();
        tableOfContents_ = new ArrayList<>();
        paragraphs_ = new ArrayList<>();
        books_ = new ArrayList<>();
    }

    @Override
    public Void visitBook(Book book) {
        books_.add(book);

        return null;
    }

    @Override
    public Void visitSection(Section section) {
        
        for (Element element : section.getContent())
        {
            if (element instanceof Book)
            {
                visitBook((Book)element);
            }
            else if (element instanceof TableOfContents)
            {
                visitTableOfContents((TableOfContents)element);
            }
            else if (element instanceof Paragraph)
            {
                visitParagraph((Paragraph)element);
            }
            else if (element instanceof ImageProxy)
            {
                visitImageProxy((ImageProxy)element);
            }
            else if (element instanceof Image)
            {
                visitImage((Image)element);
            }
            else if (element instanceof Table)
            {
                visitTable((Table)element);
            }
            else if (element instanceof Section)
            {
                ((Section)element).accept(this);
            }
            else
            {
                System.out.print("Element type unknown");
            }

            System.out.println();
        }

        return null;
    }

    @Override
    public Void visitTableOfContents(TableOfContents tableOfContents) {
        tableOfContents_.add(tableOfContents);

        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        paragraphs_.add(paragraph);

        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageProxy) {
        imageProxies_.add(imageProxy);

        return null;
    }

    @Override
    public Void visitImage(Image image) {
        images_.add(image);

        return null;
    }

    @Override
    public Void visitTable(Table table) {
        tables_.add(table);

        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        authors_.add(author);
        return null;
    }
}
