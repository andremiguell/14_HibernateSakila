package com.redoutevant.hibernatesakila.ctrl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author AMV
 */
public class CityHelper {
    
    private SessionFactory sf;
    private String hql;
    private Query q;
    
    public CityHelper() {
        sf = HibernateUtil.createSessionFactory();
    }
    
    public int count() {
        Session s = sf.openSession();
        hql = "SELECT count(*) FROM City";
        q = s.createQuery(hql);
        List l = q.list();
        s.close();
        return Integer.parseInt(l.get(0).toString());
    }
    
    public void closeAll() {
        sf.close();
        HibernateUtil.close();
    }
}
