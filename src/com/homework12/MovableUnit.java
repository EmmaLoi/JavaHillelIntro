package com.homework12;

public abstract class MovableUnit extends Unit {

    public MovableUnit(int x, int y) {
        super(x, y);
    }

    public abstract void move();

    public abstract void fire();
}