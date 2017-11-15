package com.redoutevant.hibernatesakila.ctrl;

import com.redoutevant.hibernatesakila.pojo.City;
import java.util.List;

/**
 *
 * @author AMV
 */
public interface CityCtrl{

    public void closeAll();

    public int count();

    public void setHqlCount(String hql);
    
    public String getHqlCount();
    
    public String getHqlCities();

    public void setHqlCities(String hqlCities);
    
    public List<City> getCities();
}
