package ro.uvt.sabloane.models;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;
@Entity
public class ImageProxy extends BaseElement implements Visitee, Picture {
    private  String url_;
    private  Dimension dim_;
    @Transient
    private Image realImage_ = null;

    public ImageProxy(String url_) {
        this.url_ = url_;
        this.dim_ = new Dimension(6,6);
    }

    public ImageProxy() {

    }


    public ro.uvt.sabloane.models.Image loadImages() {
        if (realImage_.equals(null)) {
            realImage_ = new ro.uvt.sabloane.models.Image(url_);
        }
        return realImage_;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    public String getUrl_() {
        return url_;
    }
}
