package ro.uvt.sabloane.models;


public interface Visitee {
    default void accept(Visitor visitor) {
        throw  new UnsupportedOperationException("Not ok!");
    };
    //void accept(BookStatistics bookStatistics);
}
