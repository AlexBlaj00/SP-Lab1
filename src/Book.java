import java.util.ArrayList;
import java.util.Arrays;

public class Book {

    private String title;
    private String[] paragraph;
    private String image;
    private String table;

    public Book(String title) {
        this.title = title;
    }

    public String[] getParagraph() {
        return paragraph;
    }

    public void createNewParagraph(String[] paragraph) {
        this.paragraph = paragraph;
    }

    public String getImage() {
        return image;
    }

    public void createNewImage(String image) {
        this.image = image;
    }

    public String getTable() {
        return table;
    }

    public void createNewTable(String table) {
        this.table = table;
    }

    public String print() {
        return "Book{" +
                "title='" + title + '\'' +
                ", paragraph=" + Arrays.toString(paragraph) +
                ", image='" + image + '\'' +
                ", table='" + table + '\'' +
                '}';
    }
}
