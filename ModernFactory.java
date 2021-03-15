package com.abstractfactory;

/**
 * @Auther: zhaoyx
 * @Data:2021/3/15 - 03 - 15 - 17:22
 * @Description:tank01
 * @version: 1.0
 */
public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
