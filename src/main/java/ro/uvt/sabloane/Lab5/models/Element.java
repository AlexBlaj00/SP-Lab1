package ro.uvt.sabloane.Lab5.models;

public interface Element {
    public void print();

    default void add(Element element){
        throw new UnsupportedOperationException("Don't add.");
    };
    default void remove(Element element){
        throw new UnsupportedOperationException("Don't remove.");
    };
    default Element get(Integer index){
        throw new UnsupportedOperationException("Don't get.");
    };
}
