package com.homework12;

public class Fence extends UnmovableUnit {

    public Fence(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isDestructible() {
        return true;
    }
}