public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        String [] paragraphs = {"Paragraph1, Paragraph2, Paragraph3"};
        discoTitanic.createNewParagraph(paragraphs);
        //discoTitanic.createNewParagraph("Paragraph 2");
        //discoTitanic.createNewParagraph("Paragraph 3");
        discoTitanic.createNewImage("Image 1");
        //discoTitanic.createNewParagraph("Paragraph 4");
        discoTitanic.createNewTable("Table 1");
        //discoTitanic.createNewParagraph("Paragraph 5");
        System.out.println(discoTitanic.print());
    }
}
