package ro.uvt.sabloane.Lab5.services;

import ro.uvt.sabloane.Lab5.models.ImageContent;

public class BMPImageLoader implements ImageLoader {

    @Override
    public ImageContent load(String img) {
        System.out.println("BMP image created");
        return new ImageContent(img);
    }
}
