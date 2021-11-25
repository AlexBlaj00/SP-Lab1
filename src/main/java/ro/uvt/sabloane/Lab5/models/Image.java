package ro.uvt.sabloane.Lab5.models;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private final String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + this.imageName);
    }



    @Override
    public void remove(Element e) {

    }

    public boolean find(Element e) {
        if (!(e instanceof Image)) {
            return false;
        }
        else {
            return ((Image) e).imageName.equals(this.imageName);
        }
    }

    public String getImageName() {
        return imageName;
    }

//    public void setImageName(String imageName) {
//        this.imageName = imageName;
//    }

    @Override
    public String toString() {
        return "Image{" +
                "imageName='" + imageName + '\'' +
                '}';
    }
}
