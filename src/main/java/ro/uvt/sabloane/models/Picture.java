package ro.uvt.sabloane.models;

import java.awt.*;
import java.awt.image.BufferedImage;

public interface Picture {
    default String url() {
        throw new UnsupportedOperationException("not ok");
    }

    default Dimension dim() {
        throw new UnsupportedOperationException("not ok");
    }

    default ImageContent content() {
        throw new UnsupportedOperationException("not ok");
    }
}
