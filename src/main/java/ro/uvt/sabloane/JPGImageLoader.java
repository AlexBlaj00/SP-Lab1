package ro.uvt.sabloane;

public class JPGImageLoader implements ImageLoader{

    @Override
    public ImageContent load(String img) {
        System.out.println("JPG Image created");
        return new ImageContent(img);
    }
}
