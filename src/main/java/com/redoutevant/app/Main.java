package com.redoutevant.app;

import com.redoutevant.hibernatesakila.ctrl.CityHelper;

/**
 *
 * @author AMV
 */
public class Main {
    public static void main(String[] args) {
        CityHelper ch = new CityHelper();
        System.out.println(ch.count());
        ch.closeAll();
    }
}
