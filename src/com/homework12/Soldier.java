package com.homework12;

public class Soldier extends MovableUnit {

    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public void move() {
        x++;
        y++;
    }

    @Override
    public void fire() {
        System.out.println("Fire!");
    }
}