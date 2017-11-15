package com.redoutevant.app;

import com.redoutevant.hibernatesakila.ctrl.CityCtrl;
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
            ctrl.closeAll();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
