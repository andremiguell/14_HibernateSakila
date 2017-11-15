/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redoutevant.hibernatesakila.ctrl;

/**
 *
 * @author dev
 */
public interface CityCtrl{

    void closeAll();

    int count();

    void setHql(String hql);
    public String getHql();
    
}
