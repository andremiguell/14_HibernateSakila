package com.redoutevant.app;

import com.redoutevant.hibernatesakila.ctrl.CityCtrl;
import com.redoutevant.hibernatesakila.pojo.City;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 *
 * @author AMV
 */
public class Main {
    
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:bean.xml");
        ctx.refresh();
        CityCtrl ctrl  = ctx.getBean("city", CityCtrl.class);
        try {
            System.out.println(ctrl.count());
            for(City c : ctrl.getCities()) {
                System.out.println(c.getCity()); 
            }
            ctrl.closeAll();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
