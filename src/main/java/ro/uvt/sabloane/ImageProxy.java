package ro.uvt.sabloane;

import java.awt.*;

public class ImageProxy implements Element, Picture{
    private String url;
    private Dimension dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
        this.dim = new Dimension(100, 100);
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {
        Element.super.add(element);
    }

    @Override
    public void remove(Element element) {
        Element.super.remove(element);
    }

    @Override
    public Element get(Integer index) {
        return Element.super.get(index);
    }

    @Override
    public String url() {
        return Picture.super.url();
    }

    @Override
    public Dimension dim() {
        return Picture.super.dim();
    }

    @Override
    public ImageContent content() {
        return Picture.super.content();
    }
}
