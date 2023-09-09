package com.greatspace.model;

import java.awt.Rectangle;

public class Enemy extends GameObject {

    private int x;
    private int y;

    private static final int SPEED = 2;

    public Enemy()
    {
    }

    public static int GeneratePosX()
   {
      return GeneratePosX(100);//ELWAS3
    }

    public static int GeneratePosX(int nb)
    {

        int aax = 456 +  (int)(Math.random() * 16*nb);
        return aax;
    }

    public static int GeneratePosY()
    {
        int aay = 10 + (int) (Math.random() * 320);

        return aay;
    }

    public void move()
    {
        move(100);
    }

    public void move(int nbEnemy)
    {
        if (this.x < 0) {
            this.x = GeneratePosX(nbEnemy);
            this.y = GeneratePosY();
        } else {
            this.x -= SPEED;
        }
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public Rectangle getBounds()
    {
        return new Rectangle(x, y, getWIDTH(), getHIGHT());
    }

}
