package ro.uvt.sabloane.Lab5.services;

import ro.uvt.sabloane.Lab5.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph p, Context c);
}
