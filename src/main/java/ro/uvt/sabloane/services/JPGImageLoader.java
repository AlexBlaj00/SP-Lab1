package ro.uvt.sabloane.services;


import ro.uvt.sabloane.models.ImageContent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPGImageLoader implements ro.uvt.sabloane.services.ImageLoader {
    public ImageContent load(String url){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(url));
            System.out.println("JPG image loading succeeded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageContent(image);
    }
}
