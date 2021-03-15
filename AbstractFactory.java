package com.abstractfactory;

/**
 * @Auther: zhaoyx
 * @Data:2021/3/15 - 03 - 15 - 17:08
 * @Description:tank01
 * @version: 1.0
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
