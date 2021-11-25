package ro.uvt.sabloane.Lab5;

import ro.uvt.sabloane.Lab5.models.Book;
import ro.uvt.sabloane.Lab5.models.ImageProxy;
import ro.uvt.sabloane.Lab5.models.Section;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");

        playboy.add(playboyS1);
        playboy.add(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboy.print();
        playboy.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 and 2 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        playboyS2.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 and 2 after loading took " + (endTime -
                startTime) + " milliseconds");
    }
}