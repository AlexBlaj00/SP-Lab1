package ro.uvt.sabloane;

public class AlignCenter implements AlignStrategy {
    public String align(String s){
        int width = 20;
        int padSize = width - s.length();
        int padStart = s.length() + padSize / 2;
        s = String.format("%" + padStart + "s", s);
        s = String.format("%-" + width + "s", s);
        return "|" + s + "|";
    }
}
