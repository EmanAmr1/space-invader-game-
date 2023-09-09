package com.greatspace.model;

import com.greatspace.proxy.ProxyImage;
import java.awt.Rectangle;

public class Bullet extends GameObject {

    private int x;
    private int y;
    private static ProxyImage imagee;
    private static final int Screenwidth = 500;
    private static final int speed = 3;

    public Bullet()
    {
        if (imagee == null) {
            imagee = new ProxyImage("/com/greatspace/sprites/bullet.png");
        }

        this.setImage(imagee.loadImage().getImage());
        this.setHeight(getImage().getHeight(null));
        this.setWidth(getImage().getWidth(null));

        this.setVisibility(true);
    }

    public void mexer()
    {

        this.x += speed;
        if (this.x > Screenwidth) {
            setVisibility(false);
        }

    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x, y, getWIDTH(), getHIGHT());
    }

}
