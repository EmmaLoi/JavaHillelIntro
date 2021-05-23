package com.homework12;

public class Tower extends UnmovableUnit {
    public Tower(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isDestructible() {
        return false;
    }
}