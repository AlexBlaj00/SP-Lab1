package ro.uvt.sabloane;

public class BMPImageLoader implements ImageLoader{

    @Override
    public ImageContent load(String img) {
        System.out.println("BMP image created");
        return new ImageContent(img);
    }
}
