package com.homework12;

public abstract class UnmovableUnit extends Unit {

    public UnmovableUnit(int x, int y) {
        super(x, y);
    }

    public abstract boolean isDestructible();
}