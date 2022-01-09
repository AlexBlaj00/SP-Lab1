package ro.uvt.sabloane.models;

import ro.uvt.sabloane.services.*;

import javax.persistence.Entity;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Image extends BaseElement implements Picture, Visitee {

    private  String url;
    private  ImageContent content = null;

    public Image(String url) {
        this.url = url;
    }

    public Image() {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageContent getContent() {
        return content;
    }

    public void setContent(ImageContent content) {
        this.content = content;
    }

    @Override
    public void accept(Visitor visitor) {
        Visitee.super.accept(visitor);
    }

}
