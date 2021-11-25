package ro.uvt.sabloane.Lab6.models;


public interface Visitee {
    void accept(Visitor visitor);
    //void accept(BookStatistics bookStatistics);
}
