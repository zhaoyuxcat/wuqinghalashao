package com.abstractfactory;

/**
 * @Auther: zhaoyx
 * @Data:2021/3/15 - 03 - 15 - 17:23
 * @Description:tank01
 * @version: 1.0
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
