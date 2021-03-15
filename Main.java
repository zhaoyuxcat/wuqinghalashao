package com.abstractfactory;

import com.factory.CarFactory;
import com.factory.Moveable;

/**
 * @Auther: zhaoyx
 * @Data:2021/3/15 - 03 - 15 - 16:35
 * @Description:tank01
 * @version: 1.0
 */

/*
* 抽象工厂
*   s
*
* */
public class Main {
    public static void main(String[] args) {
        AbstractFactory f=new ModernFactory();
        Vehicle c  = f.createVehicle();
        c.go();
        Weapon w =f.createWeapon();
        w.shoot();
        Food b=f.createFood();
        b.printName();

    }
}
