/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.arquillian.example.helloworld;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Sina
 */
@Stateless
public class ServiceBean implements ServiceBeanLocal {

    @PostConstruct
    public void initSomething() {
        System.out.println("Initializing something inside ServiceBean...");
    }

    @EJB
    private MyBeanLocal myBean;

    @Override
    public String doSomeBusiness() {
        return myBean.doSomething();
    }

}
