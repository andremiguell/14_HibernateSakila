package com.redoutevant.hibernatesakila.ctrl;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author AMV
 */
@Service("city")
public class CityHelper implements CityCtrl{
    
    private SessionFactory sf;
    private String hql;
    private Query q;
    
    public CityHelper() {
        sf = HibernateUtil.createSessionFactory();
    }
    
    @Override
    public int count() {
        Session s = sf.openSession();
        q = s.createQuery(hql);
        List l = q.list();
        s.close();
        return Integer.parseInt(l.get(0).toString());
    }
    
    @Override
    public void closeAll() {
        sf.close();
        HibernateUtil.close();
    }

    @Override
    public void setHql(String hql) {
        this.hql = hql;
    }
    
    @Override
    public String getHql() {
        return this.hql;
    }
}
