package com.greatspace.proxy;

import javax.swing.ImageIcon;
import com.greatspace.interfaces.IImage;


public class ProxyImage implements IImage {

    private RealImage image;
    private final String path;

    public ProxyImage(String path)
    {
        this.path = path;
    }

    @Override
    public ImageIcon loadImage()
    {

        if (this.image == null) {
            this.image = new RealImage(this.path);
        }

        return this.image.loadImage();
    }

}
