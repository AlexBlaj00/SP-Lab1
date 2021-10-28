package ro.uvt.sabloane;

import java.util.*;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name);
        for( SubChapter s: subChapterList) {
            s.print();
        }
    }

    public int createSubChapter(String name) {
        subChapterList.add(new SubChapter(name));
        return subChapterList.size();
    }

    public SubChapter getSubChapter(int index) {
        return subChapterList.get(index);
    }
}