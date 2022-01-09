package ro.uvt.sabloane.models;

import java.awt.image.BufferedImage;

public class ImageContent {
    BufferedImage image;

    public ImageContent(BufferedImage image) {
        if(this.image == null) {
            this.image = image;
        }
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
