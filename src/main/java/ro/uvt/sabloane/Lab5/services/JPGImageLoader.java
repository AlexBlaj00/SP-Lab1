package ro.uvt.sabloane.Lab5.services;

import ro.uvt.sabloane.Lab5.models.ImageContent;

public class JPGImageLoader implements ImageLoader {

    @Override
    public ImageContent load(String img) {
        System.out.println("JPG Image created");
        return new ImageContent(img);
    }
}
