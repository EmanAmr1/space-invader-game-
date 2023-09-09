package com.greatspace.proxy;

import javax.swing.ImageIcon;
import com.greatspace.interfaces.IImage;



public class RealImage implements IImage {

    private final String path;
    private ImageIcon Icon;

    public RealImage(String path)
    {
        this.path = path;
    }

    @Override
    public ImageIcon loadImage()
    {
        if (Icon == null) {
            Icon = new ImageIcon(getClass().getResource(path));
        }
        return Icon;
    }

}
