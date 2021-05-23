package com.homework12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fence fence = new Fence(5, 8);
        fence.isDestructible();

        Tower tower = new Tower(3, 4);
        tower.isDestructible();

        Soldier soldier = new Soldier(5, 5);
        soldier.move();
        soldier.fire();

        Tank tank = new Tank(1, 1);
        tank.move();
        tank.fire();
        tank.reload();

        List<Unit> units = new ArrayList<>();
        units.add(fence);
        units.add(tower);
        units.add(soldier);
        units.add(tank);

    }
}