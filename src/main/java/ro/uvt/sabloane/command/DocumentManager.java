package ro.uvt.sabloane.command;

import ro.uvt.sabloane.models.Book;

public class DocumentManager {
    private static Book book;
    private static DocumentManager documentManager = null;

    public static Book getBook() {
        return book;
    }

    public static void setBook(Book book) {
        DocumentManager.book = book;
    }

    public static DocumentManager getDocumentManager() {
        if (documentManager == null) {
            documentManager = new DocumentManager();
        }
        return documentManager;
    }
}
