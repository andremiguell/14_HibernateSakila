package com.redoutevant.hibernatesakila.ctrl;

import com.redoutevant.hibernatesakila.pojo.City;
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
    private String hqlCount; //spring setter injection
    private String hqlCities; //spring setter injection
    private Query q;
    private Session s;
    
    public CityHelper() {
        sf = HibernateUtil.createSessionFactory();
        s = sf.openSession();
    }
    
    @Override
    public int count() {
        q = s.createQuery(hqlCount);
        List l = q.list();
        return Integer.parseInt(l.get(0).toString());
    }
    
    @Override
    public void closeAll() {
        sf.close();
        HibernateUtil.close();
    }

    @Override
    public void setHqlCount(String hql) {
        this.hqlCount = hql;
    }
    
    @Override
    public String getHqlCount() {
        return this.hqlCount;
    }
    
    @Override
    public String getHqlCities() {
        return hqlCities;
    }

    @Override
    public void setHqlCities(String hqlCities) {
        this.hqlCities = hqlCities;
    }
    
    @Override
    public List<City> getCities(){
       q = s.createQuery(hqlCities);
       return q.list();
    }
}
