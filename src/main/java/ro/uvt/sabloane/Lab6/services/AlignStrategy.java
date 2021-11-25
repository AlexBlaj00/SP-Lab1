package ro.uvt.sabloane.Lab6.services;

import ro.uvt.sabloane.Lab6.models.Context;

public interface AlignStrategy {
    String render(String paragraph, Context context);
}
