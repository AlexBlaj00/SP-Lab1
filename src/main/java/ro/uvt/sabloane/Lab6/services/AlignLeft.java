package ro.uvt.sabloane.Lab6.services;

import ro.uvt.sabloane.Lab6.models.Context;

public class AlignLeft implements AlignStrategy {
    public String render(String paragraph, Context context)
    {
        return paragraph;
    }
}
