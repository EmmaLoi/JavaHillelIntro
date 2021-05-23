package com.homework12;

public class Tank extends MovableUnit {

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        this.x += 2;
        this.y += 2;
    }

    @Override
    public void fire() {
        System.out.println("Super Fire!!!");
    }

    protected void reload() {
        System.out.println("Reload");
    }
}