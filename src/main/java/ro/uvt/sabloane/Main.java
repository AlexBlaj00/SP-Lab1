package ro.uvt.sabloane;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chp1 = discoTitanic.getChapter(indexChapterOne-1);
        int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
        SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne-1);
        scOneOne.createNewParagraph("Paragraph 1");
        scOneOne.createNewParagraph("Paragraph 2");
        scOneOne.createNewParagraph("Paragraph 3");
        scOneOne.createNewParagraph("Paragraph 4");
        scOneOne.createNewParagraph("Paragraph 5");
        scOneOne.createNewTable("Table 1");
        scOneOne.createNewImage("Image 1");
        scOneOne.print();
    }
}
